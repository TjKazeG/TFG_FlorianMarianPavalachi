package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Accesorio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gorra extends Accesorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Float talla;
	private String color;
	public Gorra(String nombre, String descripción, Float precio, Float talla, String color) {
		super(nombre, descripción, precio);
		this.talla = talla;
		this.color = color;
	}
	public Gorra(Long id, Float talla, String color) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
	}
	public Gorra() {
		super();
	}
	public Float getTalla() {
		return talla;
	}
	public void setTalla(Float talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getId() {
		return id;
	}
	
}
