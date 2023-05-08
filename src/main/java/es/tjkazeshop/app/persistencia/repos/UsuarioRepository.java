package es.tjkazeshop.app.persistencia.repos;

import org.springframework.data.repository.CrudRepository;

import es.tjkazeshop.app.beans.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
