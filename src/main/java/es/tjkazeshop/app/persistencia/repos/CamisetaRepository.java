package es.tjkazeshop.app.persistencia.repos;

import org.springframework.data.repository.CrudRepository;

import es.tjkazeshop.app.beans.Camiseta;

public interface CamisetaRepository extends CrudRepository<Camiseta, Long> {

}
