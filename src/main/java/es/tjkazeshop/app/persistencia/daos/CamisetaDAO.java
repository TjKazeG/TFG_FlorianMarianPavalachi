package es.tjkazeshop.app.persistencia.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Camiseta;
@Repository
public interface CamisetaDAO extends CrudRepository<Camiseta, Long> {
	public List<Camiseta> findAll();
}
