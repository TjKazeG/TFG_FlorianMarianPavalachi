package es.tjkazeshop.app.negocio;

import java.util.List;
import java.util.Optional;

import es.tjkazeshop.app.beans.Gafas;
import es.tjkazeshop.app.beans.Gorra;
import es.tjkazeshop.app.beans.Pulsera;
import es.tjkazeshop.app.beans.Reloj;
import es.tjkazeshop.app.beans.base.Accesorio;

public interface AccesorioService {
	public Optional<List<Accesorio>> getAllAccesorios();
	public Optional<List<Gorra>> getAllGorras();
	public Optional<List<Gafas>> getAllGafas();
	public Optional<List<Pulsera>> getAllPulseras();
	public Optional<List<Reloj>> getAllRelojes();
	public Optional<List<Accesorio>> getRecommendedAccesorios();
}
