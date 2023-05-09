package es.tjkazeshop.app.beans.base;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Prenda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	
	private String descripción;
	
	private Float precio;
	
	private Integer stock;
	public Prenda() {
		super();
	}
	
	public Prenda(String nombre, String descripción, Float precio, Integer stock) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
		this.stock = stock;
	}

	public Prenda(Long id, String nombre, String descripción, Float precio, Integer stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
		this.stock = stock;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}
	
}
