package es.tjkazeshop.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.persistencia.repos.CamisetaRepository;
@SpringBootTest
class Pruebas {
	@Autowired
	CamisetaRepository camisetaRepo;
	@Test
	void test() {
		camisetaRepo.findAll().forEach((camiseta)->{System.out.println(camiseta.toString());});;
	}

}
