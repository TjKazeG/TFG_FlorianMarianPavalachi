package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Accesorio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Gafas extends Accesorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String forma;

	private String material;
	public Gafas() {
		super();
	}
	public Gafas(String nombre, String descripción, Float precio, String forma, String material) {
		super(nombre, descripción, precio);
		this.forma = forma;
		this.material = material;
	}
	
	public Gafas(Long id, String forma, String material) {
		super();
		this.id = id;
		this.forma = forma;
		this.material = material;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Long getId() {
		return id;
	}
	
	
}
