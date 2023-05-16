package es.tjkazeshop.app.negocio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tjkazeshop.app.beans.Usuario;
import es.tjkazeshop.app.negocio.UsuarioService;
import es.tjkazeshop.app.persistencia.daos.UsuarioDAO;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private final UsuarioDAO usuarioDAO;
	
	public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
		super();
		this.usuarioDAO = usuarioDAO;
	}

	@Override
	public Usuario register(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}

	@Override
	public Usuario getUsuarioByNombre(Usuario usuario) {
		return usuarioDAO.findByNombreUsuario(usuario.getNombreUsuario());
	}

	

}
