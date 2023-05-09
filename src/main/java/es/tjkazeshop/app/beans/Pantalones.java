package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Prenda;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pantalones extends Prenda{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String talla;
	private String tipoTela;
	public Pantalones() {
		super();
	}
	
	public Pantalones(String nombre, String descripción, Float precio, Integer stock, String talla, String tipoTela) {
		super(nombre, descripción, precio, stock);
		this.talla = talla;
		this.tipoTela = tipoTela;
	}

	public Pantalones(Long id, String talla, String tipoTela) {
		super();
		this.id = id;
		this.talla = talla;
		this.tipoTela = tipoTela;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}
	public Long getId() {
		return id;
	}
	
	
}
