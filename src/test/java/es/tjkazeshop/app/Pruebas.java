package es.tjkazeshop.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.beans.Usuario;
import es.tjkazeshop.app.persistencia.repos.CamisetaRepository;
@SpringBootTest
class Pruebas {
	@Autowired
	CamisetaRepository camisetaRepo;
	@Test
	void test() {
		String pass="contra";
		Usuario usuario=new Usuario("prueba", pass, "prueba@gmail.com");
		assertTrue(String.valueOf(pass.hashCode()).equalsIgnoreCase(usuario.getContrasenha()));
	}

}
