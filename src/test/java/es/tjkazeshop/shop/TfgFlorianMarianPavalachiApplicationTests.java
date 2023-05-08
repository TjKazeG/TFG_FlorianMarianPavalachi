package es.tjkazeshop.shop;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.beans.Camiseta;
import es.tjkazeshop.app.persistencia.repos.CamisetaRepository;


@SpringBootTest
class TfgFlorianMarianPavalachiApplicationTests {
	
	@Autowired
	CamisetaRepository camisetaRepo;
	@Test
	void contextLoads() {
		Camiseta prenda=new Camiseta("cami", "seta", 14.4F, "XL", "Azul", "Larga");
		camisetaRepo.save(prenda);
		camisetaRepo.findAll().forEach((camiseta)->{System.out.println(camiseta.getColor());});
	}

}
