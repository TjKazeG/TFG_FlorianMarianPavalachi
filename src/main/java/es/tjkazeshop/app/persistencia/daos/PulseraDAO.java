package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Pulsera;
@Repository
public interface PulseraDAO extends CrudRepository<Pulsera, Long> {
	public List<Pulsera> findAll();
}
