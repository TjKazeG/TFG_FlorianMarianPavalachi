package es.tjkazeshop.app;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.persistencia.daos.CamisetaDAO;
import es.tjkazeshop.app.persistencia.daos.PrendaDAO;


@SpringBootTest
class TfgFlorianMarianPavalachiApplicationTests {
	
	@Autowired
	CamisetaDAO camisetaRepo;
	@Autowired
	PrendaDAO prendaRepository;
	@Test
	void contextLoads() {
		camisetaRepo.findAll().forEach((camiseta)->{System.out.println(camiseta.getNombre());});
		System.out.println("--------------------------------------Prendas--------------------------------");
		prendaRepository.findAll().forEach((prenda)->{System.out.println(prenda.getNombre());});
	}

}
