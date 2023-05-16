package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.base.Prenda;
@Repository
public interface PrendaDAO extends CrudRepository<Prenda, Long> {
	public List<Prenda> findAll();
}
