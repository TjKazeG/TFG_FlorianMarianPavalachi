package es.tjkazeshop.app.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.negocio.impl.PrendaServiceImpl;
@SpringBootTest
class PrendaServiceTest {
	@Autowired
	PrendaServiceImpl prendaService;
	@Test
	void testRecommendedPrenda() {
		prendaService.getRecommendedPrendas().get().forEach((prenda)->{System.out.println(prenda.getNombre());});
		assertTrue(prendaService.getRecommendedPrendas().get().size()>0);
	}

}
