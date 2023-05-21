package es.tjkazeshop.app.negocio.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tjkazeshop.app.beans.Gafas;
import es.tjkazeshop.app.beans.Gorra;
import es.tjkazeshop.app.beans.Pulsera;
import es.tjkazeshop.app.beans.Reloj;
import es.tjkazeshop.app.beans.base.Accesorio;
import es.tjkazeshop.app.negocio.AccesorioService;
import es.tjkazeshop.app.persistencia.daos.AccesorioDAO;
import es.tjkazeshop.app.persistencia.daos.GafasDAO;
import es.tjkazeshop.app.persistencia.daos.GorraDAO;
import es.tjkazeshop.app.persistencia.daos.PulseraDAO;
import es.tjkazeshop.app.persistencia.daos.RelojDAO;
import es.tjkazeshop.app.utils.Utils;

@Service
public class AccesorioServiceImpl implements AccesorioService {
	@Autowired
	private final AccesorioDAO accesorioDAO;
	@Autowired
	private final GafasDAO gafasDAO;
	@Autowired
	private final GorraDAO gorraDAO;
	@Autowired
	private final PulseraDAO pulseraDAO;
	@Autowired
	private final RelojDAO relojDAO;
	
	public AccesorioServiceImpl(AccesorioDAO accesorioDAO, GafasDAO gafasDAO, GorraDAO gorraDAO, PulseraDAO pulseraDAO,
			RelojDAO relojDAO) {
		super();
		this.accesorioDAO = accesorioDAO;
		this.gafasDAO = gafasDAO;
		this.gorraDAO = gorraDAO;
		this.pulseraDAO = pulseraDAO;
		this.relojDAO = relojDAO;
	}

	@Override
	public Optional<List<Accesorio>> getAllAccesorios() {
		return Optional.ofNullable(accesorioDAO.findAll());
	}

	@Override
	public Optional<List<Gorra>> getAllGorras() {
		return Optional.ofNullable(gorraDAO.findAll());
	}

	@Override
	public Optional<List<Gafas>> getAllGafas() {
		return Optional.ofNullable(gafasDAO.findAll());
	}

	@Override
	public Optional<List<Pulsera>> getAllPulseras() {
		return Optional.ofNullable(pulseraDAO.findAll());
	}

	@Override
	public Optional<List<Reloj>> getAllRelojes() {
		return Optional.ofNullable(relojDAO.findAll());
	}

	@Override
	public Optional<List<Accesorio>> getRecommendedAccesorios() {
		return Optional.of(List.of(
				gorraDAO.findById
					(Utils.getRandomIDbyList(
						gorraDAO.findAll().stream()
							.map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()
				,gafasDAO.findById(Utils.getRandomIDbyList(
						gafasDAO.findAll().stream().map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()
				,pulseraDAO.findById(Utils.getRandomIDbyList(
						pulseraDAO.findAll().stream().map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()
				,relojDAO.findById(Utils.getRandomIDbyList(
						relojDAO.findAll().stream().map((accesorio)->{return accesorio.getId();}).collect(Collectors.toList()))).get()));

	}

	@Override
	public Optional<Accesorio> getAccesorioByID(Long id) {
		return Optional.ofNullable(accesorioDAO.findById(id).get());
	}
	
	
}
