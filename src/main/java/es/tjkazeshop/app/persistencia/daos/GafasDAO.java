package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Gafas;

@Repository
public interface GafasDAO extends CrudRepository<Gafas, Long> {
	public List<Gafas> findAll();
}
