package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Prenda;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Camiseta extends Prenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String talla;
	
	private String color;
	
	private String tipoManga;
	public Camiseta() {
		super();
	}
	
	public Camiseta(String nombre, String descripción, Float precio, String talla, String color, String tipoManga) {
		super(nombre, descripción, precio);
		this.talla = talla;
		this.color = color;
		this.tipoManga = tipoManga;
	}

	public Camiseta(Long id, String talla, String color, String tipoManga) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.tipoManga = tipoManga;
	}

	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoManga() {
		return tipoManga;
	}
	public void setTipoManga(String tipoManga) {
		this.tipoManga = tipoManga;
	}
	public Long getId() {
		return id;
	}
	
}
