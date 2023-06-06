package es.tjkazeshop.app.negocio.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

import es.tjkazeshop.app.beans.base.Accesorio;
import es.tjkazeshop.app.beans.base.Prenda;
import es.tjkazeshop.app.dtos.PaymentIntentDTO;
import es.tjkazeshop.app.negocio.PagoService;
import es.tjkazeshop.app.persistencia.daos.AccesorioDAO;
import es.tjkazeshop.app.persistencia.daos.PrendaDAO;
@Service
public class PagoServiceImpl implements PagoService {
	@Value("${stripe.key.secret}")
    String secretKey;
	
	@Autowired
	private final PrendaDAO prendaDAO;
	@Autowired
	private final AccesorioDAO accesorioDAO;
	
    public PagoServiceImpl(PrendaDAO prendaDAO, AccesorioDAO accesorioDAO) {
		super();
		this.prendaDAO = prendaDAO;
		this.accesorioDAO = accesorioDAO;
	}
    @Override
	public PaymentIntent pagar(PaymentIntentDTO paymentIntentDto) throws StripeException {
        Stripe.apiKey = secretKey;
        List<String> paymentMethodTypes = new ArrayList<String>();
        paymentMethodTypes.add("card");
        Map<String, Object> params = new HashMap<>();
        params.put("amount", paymentIntentDto.getAmount());
        params.put("currency", paymentIntentDto.getCurrency());
        params.put("description", paymentIntentDto.getDescription());
        params.put("payment_method_types", paymentMethodTypes);
        return PaymentIntent.create(params);
    }
    @Override
    public PaymentIntent confirmar(String id,Long idArticulo) throws StripeException {
        Stripe.apiKey = secretKey;
        PaymentIntent paymentIntent = PaymentIntent.retrieve(id);
        Map<String, Object> params = new HashMap<>();
        params.put("payment_method", "pm_card_visa");
        paymentIntent.confirm(params);
        if (paymentIntent.getDescription().equalsIgnoreCase("prenda")) {
			reducirStockPrenda(idArticulo);
		}else if(paymentIntent.getDescription().equalsIgnoreCase("accesorio")){
			reducirStockAccesorio(idArticulo);
		}
        return paymentIntent;
    }
    @Override
    public PaymentIntent cancelar(String id) throws StripeException {
        Stripe.apiKey = secretKey;
        PaymentIntent paymentIntent = PaymentIntent.retrieve(id);
        paymentIntent.cancel();
        return paymentIntent;
    }
    
    private void reducirStockPrenda(Long id) {
    	Prenda prenda=prendaDAO.findById(id).get();
    	prenda.setStock(prendaDAO.findById(id).get().getStock()-1);
    	prendaDAO.save(prenda);
    }
    
    private void reducirStockAccesorio(Long id) {
    	Accesorio accesorio=accesorioDAO.findById(id).get();
    	accesorio.setStock(accesorioDAO.findById(id).get().getStock()-1);
    	accesorioDAO.save(accesorio);
    }
}
