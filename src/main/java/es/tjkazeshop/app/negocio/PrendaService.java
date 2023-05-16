package es.tjkazeshop.app.negocio;

import java.util.List;
import java.util.Optional;

import es.tjkazeshop.app.beans.Camiseta;
import es.tjkazeshop.app.beans.Pantalones;
import es.tjkazeshop.app.beans.base.Prenda;

public interface PrendaService {
	public Optional<List<Prenda>> getAllPrendas();
	public Optional<List<Camiseta>> getAllCamisetas();
	public Optional<List<Pantalones>> getAllPantalones();
	public Optional<List<Prenda>> getRecommendedPrendas();
	
}
