package es.tjkazeshop.app.persistencia.repos;

import org.springframework.data.repository.CrudRepository;

import es.tjkazeshop.app.beans.base.Prenda;

public interface PrendaRepository extends CrudRepository<Prenda, Long> {

}
