package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Pantalones;
@Repository
public interface PantalonesDAO extends CrudRepository<Pantalones, Long> {
	public List<Pantalones> findAll();
}
