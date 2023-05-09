package es.tjkazeshop.app.beans;

import es.tjkazeshop.app.beans.base.Accesorio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pulsera extends Accesorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String material;
	private String disenho;
	public Pulsera() {
		super();
	}
	
	public Pulsera(String nombre, String descripción, Float precio, Integer stock, String material, String disenho) {
		super(nombre, descripción, precio, stock);
		this.material = material;
		this.disenho = disenho;
	}

	public Pulsera(Long id, String material, String disenho) {
		super();
		this.id = id;
		this.material = material;
		this.disenho = disenho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDisenho() {
		return disenho;
	}
	public void setDisenho(String disenho) {
		this.disenho = disenho;
	}
	public Long getId() {
		return id;
	}
	
	
	
	
}
