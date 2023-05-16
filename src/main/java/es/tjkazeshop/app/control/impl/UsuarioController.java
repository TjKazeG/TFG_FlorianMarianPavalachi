package es.tjkazeshop.app.control.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.tjkazeshop.app.beans.Usuario;
import es.tjkazeshop.app.negocio.impl.UsuarioServiceImpl;
import es.tjkazeshop.app.security.PasswordEncoder;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController  {
	@Autowired
	private final UsuarioServiceImpl usuarioServiceImpl;
	
	public UsuarioController(UsuarioServiceImpl usuarioServiceImpl) {
		super();
		this.usuarioServiceImpl = usuarioServiceImpl;
	}
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
		
		return Optional.ofNullable(usuarioServiceImpl.getUsuarioByNombre(usuario))
	               .map(user -> {
	                   if (new PasswordEncoder().matches(usuario.getContrasenha(), user.getContrasenha())) {
	                       return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
	                   } else {
	                       return new ResponseEntity<Usuario>(usuario,HttpStatus.BAD_REQUEST);
	                   }
	               })
	               .orElse(new ResponseEntity<Usuario>(usuario,HttpStatus.BAD_REQUEST));
	}
	@PostMapping("/registro")
	public ResponseEntity<Usuario> registro(@RequestBody Usuario usuario) {
		
		return Optional.ofNullable(usuarioServiceImpl.getUsuarioByNombre(usuario))
				.map((user)->{return new ResponseEntity<Usuario>(user,HttpStatus.BAD_REQUEST);})
				.orElseGet(()->{
					   usuario.setContrasenha(new PasswordEncoder().encode(usuario.getContrasenha()));
					   usuarioServiceImpl.register(usuario);
	                   return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
				});
	}

}
