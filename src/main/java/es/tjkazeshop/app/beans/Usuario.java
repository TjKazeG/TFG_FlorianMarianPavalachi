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

	public Usuario() {
		super();
	}

	public Usuario(String nombreUsuario, String contrasenha) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenha = contrasenha;
	}

	public Usuario(Long id, String nombreUsuario, String contrasenha) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.contrasenha = contrasenha;
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
