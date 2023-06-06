package es.tjkazeshop.app.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

import es.tjkazeshop.app.dtos.PaymentIntentDTO;
import es.tjkazeshop.app.dtos.PaymentIntentDTO.Currency;
import es.tjkazeshop.app.negocio.impl.PagoServiceImpl;
@SpringBootTest
class PagoServiceTest {
	@Autowired
	PagoServiceImpl pagoServiceImpl;
	@Test
	void test() {
		try {
			PaymentIntentDTO payment=new PaymentIntentDTO("prenda",100,Currency.EUR);
			PaymentIntent paymentIntent=pagoServiceImpl.pagar(payment);
			paymentIntent=pagoServiceImpl.confirmar(paymentIntent.getId(),1L);
			System.out.println(paymentIntent.toJson());
		} catch (StripeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
