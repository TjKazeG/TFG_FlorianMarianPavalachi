package es.tjkazeshop.app.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.tjkazeshop.app.beans.Gafas;
import es.tjkazeshop.app.beans.Gorra;
import es.tjkazeshop.app.beans.Pulsera;
import es.tjkazeshop.app.beans.Reloj;
import es.tjkazeshop.app.beans.base.Accesorio;
import es.tjkazeshop.app.negocio.impl.AccesorioServiceImpl;

@RestController
@RequestMapping("/accesorios")
@CrossOrigin(origins = "http://localhost:4200")
public class AccesorioController  {
	@Autowired
	private final AccesorioServiceImpl accesorioService;

	public AccesorioController(AccesorioServiceImpl accesorioService) {
		super();
		this.accesorioService = accesorioService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Accesorio>> getAllAccesorios(){
		return accesorioService.getAllAccesorios()
				.map(accesorios->{return new ResponseEntity<List<Accesorio>>(accesorios,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Accesorio>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/gafas")
	public ResponseEntity<List<Gafas>> getAllGafas(){
		return accesorioService.getAllGafas()
				.map(gafas->{return new ResponseEntity<List<Gafas>>(gafas,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Gafas>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/gorras")
	public ResponseEntity<List<Gorra>> getAllGorras(){
		return accesorioService.getAllGorras()
				.map(gorras->{return new ResponseEntity<List<Gorra>>(gorras,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Gorra>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/pulseras")
	public ResponseEntity<List<Pulsera>> getAllPulseras(){
		return accesorioService.getAllPulseras()
				.map(pulseras->{return new ResponseEntity<List<Pulsera>>(pulseras,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Pulsera>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/relojes")
	public ResponseEntity<List<Reloj>> getAllRelojes(){
		return accesorioService.getAllRelojes()
				.map(relojes->{return new ResponseEntity<List<Reloj>>(relojes,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Reloj>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/recommended")
	public ResponseEntity<List<Accesorio>> getRecommendedAccesorios(){
		return accesorioService.getRecommendedAccesorios()
				.map(accesorios->{return new ResponseEntity<List<Accesorio>>(accesorios,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Accesorio>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/findbyid/{id}")
	public ResponseEntity<Accesorio> getPrendasByID(@PathVariable Long id){
		return accesorioService.getAccesorioByID(id)
				.map(accesorio->{return new ResponseEntity<Accesorio>(accesorio,HttpStatus.OK);})
				.orElse(new ResponseEntity<Accesorio>(HttpStatus.NO_CONTENT));
	}
}
