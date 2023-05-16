package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Reloj;
@Repository
public interface RelojDAO extends CrudRepository<Reloj, Long> {
	public List<Reloj> findAll();
}
