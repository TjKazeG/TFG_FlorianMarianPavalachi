package es.tjkazeshop.app.negocio;



import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

import es.tjkazeshop.app.dtos.PaymentIntentDTO;

public interface PagoService {
	public PaymentIntent pagar(PaymentIntentDTO paymentIntentDto) throws StripeException;
	public PaymentIntent confirmar(String id,Long idArticulo) throws StripeException;
	public PaymentIntent cancelar(String id) throws StripeException;
}
