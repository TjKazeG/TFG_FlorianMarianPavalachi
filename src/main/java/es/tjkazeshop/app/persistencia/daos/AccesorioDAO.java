package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.base.Accesorio;
@Repository
public interface AccesorioDAO extends CrudRepository<Accesorio, Long> {
	public List<Accesorio> findAll();
}
