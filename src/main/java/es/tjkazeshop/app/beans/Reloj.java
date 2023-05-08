package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Accesorio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Reloj extends Accesorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String tipo;
	public Reloj() {
		super();
	}
	public Reloj(String nombre, String descripción, Float precio, String marca, String tipo) {
		super(nombre, descripción, precio);
		this.marca = marca;
		this.tipo = tipo;
	}
	public Reloj(Long id, String marca, String tipo) {
		super();
		this.id = id;
		this.marca = marca;
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
	
	
}
