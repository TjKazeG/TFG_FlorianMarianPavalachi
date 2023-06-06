package es.tjkazeshop.app.control.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

import es.tjkazeshop.app.dtos.PaymentIntentDTO;
import es.tjkazeshop.app.negocio.impl.PagoServiceImpl;

@RestController
@RequestMapping("/pago")
@CrossOrigin(origins = "http://localhost:4200")
public class PagoController {
	@Autowired
    private PagoServiceImpl pagoService;

    @PostMapping("/pagar/{idArticulo}")
    public ResponseEntity<String> chargePayment(@PathVariable Long idArticulo,@RequestBody PaymentIntentDTO paymentIntentDTO) {
    	try {
			PaymentIntent paymentIntent=pagoService.pagar(paymentIntentDTO);
			if (paymentIntent.getDescription().equalsIgnoreCase(paymentIntentDTO.getDescription())) {
				 return new ResponseEntity<String>(pagoService.confirmar(paymentIntent.getId(),idArticulo).toJson(),HttpStatus.OK);
			}else {
				return new ResponseEntity<String>(pagoService.cancelar(paymentIntent.getId()).toJson(),HttpStatus.UNAUTHORIZED);
			}
		} catch (StripeException e) {
			e.printStackTrace();
		}
        return new ResponseEntity<String>("No se pudo realizar la operación",HttpStatus.BAD_REQUEST);
    }
}
