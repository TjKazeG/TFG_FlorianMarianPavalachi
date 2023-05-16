package es.tjkazeshop.app.control.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.tjkazeshop.app.beans.Camiseta;
import es.tjkazeshop.app.beans.Pantalones;
import es.tjkazeshop.app.beans.base.Prenda;
import es.tjkazeshop.app.negocio.impl.PrendaServiceImpl;

@RestController
@RequestMapping("/prendas")
public class PrendaController  {
	@Autowired
	private final PrendaServiceImpl prendaService;

	public PrendaController(PrendaServiceImpl prendaService) {
		super();
		this.prendaService = prendaService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Prenda>> getAllPrendas(){
		return prendaService.getAllPrendas()
				.map(prendas->{return new ResponseEntity<List<Prenda>>(prendas,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Prenda>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/camisetas")
	public ResponseEntity<List<Camiseta>> getAllCamisetas(){
		return prendaService.getAllCamisetas()
				.map(camisetas->{return new ResponseEntity<List<Camiseta>>(camisetas,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Camiseta>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/pantalones")
	public ResponseEntity<List<Pantalones>> getAllPantalones(){
		return prendaService.getAllPantalones()
				.map(pantalones->{return new ResponseEntity<List<Pantalones>>(pantalones,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Pantalones>>(HttpStatus.NO_CONTENT));
	}
	@GetMapping("/recommended")
	public ResponseEntity<List<Prenda>> getRecommendedPrendas(){
		return prendaService.getRecommendedPrendas()
				.map(prendas->{return new ResponseEntity<List<Prenda>>(prendas,HttpStatus.OK);})
				.orElse(new ResponseEntity<List<Prenda>>(HttpStatus.NO_CONTENT));
	}
	
}
