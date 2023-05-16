package es.tjkazeshop.app.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.negocio.impl.AccesorioServiceImpl;
@SpringBootTest
class AccesorioServiceTest {
	@Autowired
	AccesorioServiceImpl accesorioServiceImpl;

	@Test
	void testRecommendedAccesorio() {
		accesorioServiceImpl.getRecommendedAccesorios().get().forEach((accesorio)->{System.out.println(accesorio.getNombre());});
		assertTrue(accesorioServiceImpl.getRecommendedAccesorios().get().size()>0);
	}
	@Test
	void testConcreteAccesorio() {
		accesorioServiceImpl.getAllGorras().get().forEach((accesorio)->{System.out.println(accesorio.getNombre());});
		assertTrue(accesorioServiceImpl.getAllGorras().get().size()>0);
	}

}
