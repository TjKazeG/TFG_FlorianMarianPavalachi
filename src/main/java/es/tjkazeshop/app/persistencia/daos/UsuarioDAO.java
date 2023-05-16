package es.tjkazeshop.app.persistencia.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.tjkazeshop.app.beans.Usuario;
@Repository
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
	public Usuario findByNombreUsuario(String nombreUsuario);
}
