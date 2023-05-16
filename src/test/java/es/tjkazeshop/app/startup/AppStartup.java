package es.tjkazeshop.app.startup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.tjkazeshop.app.persistencia.daos.CamisetaDAO;
import es.tjkazeshop.app.persistencia.daos.GafasDAO;
import es.tjkazeshop.app.persistencia.daos.GorraDAO;
import es.tjkazeshop.app.persistencia.daos.PantalonesDAO;
import es.tjkazeshop.app.persistencia.daos.PulseraDAO;
import es.tjkazeshop.app.persistencia.daos.RelojDAO;
import es.tjkazeshop.app.persistencia.daos.UsuarioDAO;

//Aplicacion de un solo uso que sirve para rellenar los datos de la DB.

@SpringBootTest
class AppStartup {
	@Autowired
	CamisetaDAO camisetaRepository;
	@Autowired
	GafasDAO gafasRepository;
	@Autowired
	GorraDAO gorraRepository;
	@Autowired
	PantalonesDAO pantalonesRepository;
	@Autowired
	PulseraDAO pulseraRepository;
	@Autowired
	RelojDAO relojRepository;
	@Autowired
	UsuarioDAO usuarioRepository;
	
	@Test
	void Startup() {
	//	new ObjectMother(camisetaRepository, gafasRepository, gorraRepository, pantalonesRepository, pulseraRepository, relojRepository, usuarioRepository);
	}

}
