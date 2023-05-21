package es.tjkazeshop.app.negocio.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tjkazeshop.app.beans.Camiseta;
import es.tjkazeshop.app.beans.Pantalones;
import es.tjkazeshop.app.beans.base.Prenda;
import es.tjkazeshop.app.negocio.PrendaService;
import es.tjkazeshop.app.persistencia.daos.CamisetaDAO;
import es.tjkazeshop.app.persistencia.daos.PantalonesDAO;
import es.tjkazeshop.app.persistencia.daos.PrendaDAO;
import es.tjkazeshop.app.utils.Utils;

@Service
public class PrendaServiceImpl implements PrendaService {
	@Autowired
	private final CamisetaDAO camisetaDAO;
	@Autowired
	private final PantalonesDAO pantalonesDAO;
	@Autowired
	private final PrendaDAO prendasDAO;
	public PrendaServiceImpl(CamisetaDAO camisetaDAO, PantalonesDAO pantalonesDAO, PrendaDAO prendaDAO) {
		super();
		this.prendasDAO=prendaDAO;
		this.camisetaDAO = camisetaDAO;
		this.pantalonesDAO = pantalonesDAO;
	}

	@Override
	public Optional<List<Prenda>> getAllPrendas() {
		return Optional.ofNullable(prendasDAO.findAll());
	}

	@Override
	public Optional<List<Camiseta>> getAllCamisetas() {
		return Optional.ofNullable(camisetaDAO.findAll());
	}

	@Override
	public Optional<List<Pantalones>> getAllPantalones() {
		return Optional.ofNullable(pantalonesDAO.findAll());
	}

	@Override
	public Optional<List<Prenda>> getRecommendedPrendas() {
		return Optional.of(List.of(
				camisetaDAO.findById(Utils.getRandomIDbyList(
						camisetaDAO.findAll().stream().map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()
				,pantalonesDAO.findById(Utils.getRandomIDbyList(
						pantalonesDAO.findAll().stream().map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()));

	}

	@Override
	public Optional<Prenda> getPrendaByID(Long id) {
		return Optional.ofNullable(prendasDAO.findById(id).get());
	}

}
