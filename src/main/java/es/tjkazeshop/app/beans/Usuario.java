package es.tjkazeshop.app.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombreUsuario;

	private String contrasenha;

	private String email;

	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String contrasenha, String email) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenha = contrasenha;
		this.email = email;
	}

	public Usuario(Long id, String nombreUsuario, String contrasenha, String email) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.contrasenha = contrasenha;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public Long getId() {
		return id;
	}

}
