package es.tjkazeshop.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.beans.Usuario;
import es.tjkazeshop.app.persistencia.daos.CamisetaDAO;
@SpringBootTest
class Pruebas {
	@Autowired
	CamisetaDAO camisetaRepo;
	@Test
	void test() {
		
	}

}
