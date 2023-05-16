package es.tjkazeshop.app.negocio;

import es.tjkazeshop.app.beans.Usuario;

public interface UsuarioService {
	public Usuario register(Usuario usuario);
	public Usuario getUsuarioByNombre(Usuario usuario);
}
