package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Gorra;
@Repository
public interface GorraDAO extends CrudRepository<Gorra, Long> {
	public List<Gorra> findAll();
}
