package es.tjkazeshop.app.startup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.persistencia.repos.CamisetaRepository;
import es.tjkazeshop.app.persistencia.repos.GafasRepository;
import es.tjkazeshop.app.persistencia.repos.GorraRepository;
import es.tjkazeshop.app.persistencia.repos.PantalonesRepository;
import es.tjkazeshop.app.persistencia.repos.PulseraRepository;
import es.tjkazeshop.app.persistencia.repos.RelojRepository;
import es.tjkazeshop.app.persistencia.repos.UsuarioRepository;

//Aplicacion de un solo uso que sirve para rellenar los datos de la DB.

@SpringBootTest
class AppStartup {
	@Autowired
	CamisetaRepository camisetaRepository;
	@Autowired
	GafasRepository gafasRepository;
	@Autowired
	GorraRepository gorraRepository;
	@Autowired
	PantalonesRepository pantalonesRepository;
	@Autowired
	PulseraRepository pulseraRepository;
	@Autowired
	RelojRepository relojRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Test
	void Startup() {
	//	new ObjectMother(camisetaRepository, gafasRepository, gorraRepository, pantalonesRepository, pulseraRepository, relojRepository, usuarioRepository);
	}

}
