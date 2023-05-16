package es.tjkazeshop.app.startup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import es.tjkazeshop.app.beans.Camiseta;
import es.tjkazeshop.app.beans.Gafas;
import es.tjkazeshop.app.beans.Gorra;
import es.tjkazeshop.app.beans.Pantalones;
import es.tjkazeshop.app.beans.Pulsera;
import es.tjkazeshop.app.beans.Reloj;
import es.tjkazeshop.app.beans.Usuario;
import es.tjkazeshop.app.factory.AbstractFactory;
import es.tjkazeshop.app.factory.ConcreteCamisetaFactory;
import es.tjkazeshop.app.factory.ConcreteGafasFactory;
import es.tjkazeshop.app.factory.ConcreteGorrasFactory;
import es.tjkazeshop.app.factory.ConcretePantalonesFactory;
import es.tjkazeshop.app.factory.ConcretePulserasFactory;
import es.tjkazeshop.app.factory.ConcreteRelojFactory;
import es.tjkazeshop.app.persistencia.daos.CamisetaDAO;
import es.tjkazeshop.app.persistencia.daos.GafasDAO;
import es.tjkazeshop.app.persistencia.daos.GorraDAO;
import es.tjkazeshop.app.persistencia.daos.PantalonesDAO;
import es.tjkazeshop.app.persistencia.daos.PulseraDAO;
import es.tjkazeshop.app.persistencia.daos.RelojDAO;
import es.tjkazeshop.app.persistencia.daos.UsuarioDAO;

//@Service
public class ObjectMother {
	@Autowired
	private final CamisetaDAO camisetaRepository;
	@Autowired
	private final GafasDAO gafasRepository;
	@Autowired
	private final GorraDAO gorraRepository;
	@Autowired
	private final PantalonesDAO pantalonesRepository;
	@Autowired
	private final PulseraDAO pulseraRepository;
	@Autowired
	private final RelojDAO relojRepository;
	@Autowired
	private final UsuarioDAO usuarioRepository;
	
	public ObjectMother(CamisetaDAO camisetaRepository, GafasDAO gafasRepository,
			GorraDAO gorraRepository, PantalonesDAO pantalonesRepository,
			PulseraDAO pulseraRepository, RelojDAO relojRepository, UsuarioDAO usuarioRepository) {
		super();
		this.camisetaRepository = camisetaRepository;
		this.gafasRepository = gafasRepository;
		this.gorraRepository = gorraRepository;
		this.pantalonesRepository = pantalonesRepository;
		this.pulseraRepository = pulseraRepository;
		this.relojRepository = relojRepository;
		this.usuarioRepository = usuarioRepository;
		
		Usuario admin=new Usuario("admin", "admin", "admin@tjkazeshop.es");
		usuarioRepository.save(admin);
		
		String[] nombres= {"Camiseta Azul","Camiseta Negra","Camiseta Blanca"};
		String[] descripciones= {"Camiseta Azul, talla L, manga corta","Camiseta Negra, talla XL, manga corta","Camiseta Blanca, talla M, manga larga"};
		Float[] precios= {25.95F,19.95F,29.95F};
		Integer[] stocks= {10,20,30};
		String[] tallas= {"L","XL","M"};
		String[] colores= {"Azul","Negro","Blanco"};
		String[] tiposManga= {"Corta","Corta","Larga"};
		List<Camiseta> camisetas=populateData(camisetaRepository, new ConcreteCamisetaFactory(nombres, descripciones, precios, stocks, tallas, colores, tiposManga));
		
		String[] nombresGafas= {"Gafas de Pasta","Gafas de Sol","Gafas estilo Aviador"};
		String[] descripcionesGafas= {"Gafas para aparentar","Son gafas de sol no sé","Gafas de estilo Aviador, mucho estilo y tal"};
		Float[] preciosGafas= {5.95F,39.95F,49.95F};
		Integer[] stocksGafas= {100,50,20};
		String[] formas= {"Pasta","De Sol","Aviador"};
		String[] materiales= {"Plastico","Plastico","Plastico"};
		List<Gafas> gafas=populateData(gafasRepository, new ConcreteGafasFactory(nombresGafas, descripcionesGafas, preciosGafas, stocksGafas, formas, materiales));
		
		String[] nombresGorras= {"Gorra NY","Gorra LA"};
		String[] descripcionesGorras= {"Gorra Blanca NY","Gorra Negra LA"};
		Float[] preciosGorras= {25.95F,29.95F};
		Integer[] stocksGorras= {50,50};
		Float[] tallasGorras= {18.5F,21.5F,};
		String[] coloresGorras= {"Blanco","Negro"};
		List<Gorra>gorras=populateData(gorraRepository, new ConcreteGorrasFactory(nombresGorras, descripcionesGorras, preciosGorras, stocksGorras, tallasGorras, coloresGorras));
		
		String[] nombresPantalones= {"Vaqueros L","Vaqueros XL"};
		String[] descripcionesPantalones= {"Pantalones Vaqueros talla L","Pantalones Vaqueros talla XL"};
		Float[] preciosPantalones= {49.95F,45.95F};
		Integer[] stocksPantalones= {25,25};
		String[] tallasPantalones= {"L","XL"};
		String[] telasPantalones= {"Vaqueros","Vaqueros"};
		List<Pantalones>pantalones=populateData(pantalonesRepository, new ConcretePantalonesFactory(nombresPantalones, descripcionesPantalones, preciosPantalones, stocksPantalones, tallasPantalones, telasPantalones));
		
		String[] nombresPulsera= {"Pulsera Punk"};
		String[] descripcionesPulsera= {"Pulsera Punk de fibra textil"};
		Float[] preciosPulsera= {9.95F};
		Integer[] stocksPulsera= {40};
		String[] materialesPulsera= {"Fibra Textil"};
		String[] disenhosPulsera= {"Punk"};
		List<Pulsera> pulseras=populateData(pulseraRepository, new ConcretePulserasFactory(nombresPulsera, descripcionesPulsera, preciosPulsera, stocksPulsera, materialesPulsera, disenhosPulsera));
		
		String[] nombresReloj= {"Reloj Rolex"};
		String[] descripcionesReloj= {"Reloj de Aguja Rolex"};
		Float[] preciosReloj= {199.95F};
		Integer[] stocksReloj= {5};
		String[] marcasReloj= {"Rolex"};
		String[] tiposReloj= {"Aguja"};
		List<Reloj> relojes=populateData(relojRepository, new ConcreteRelojFactory(nombresReloj, descripcionesReloj, preciosReloj, stocksReloj, marcasReloj, tiposReloj));
	}

	public List populateData(CrudRepository crudRepository, AbstractFactory abstractFactory) {
		List list=abstractFactory.getList();
		for (int i = 0; i < list.size(); i++) {
			crudRepository.save(list.get(i));
		}
		return list;

	}
}
