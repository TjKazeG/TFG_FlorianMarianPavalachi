package es.tjkazeshop.app.beans.base;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Accesorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String descripción;
	
	private Float precio;
	public Accesorio() {
		super();
	}
	public Accesorio(String nombre, String descripción, Float precio) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
	}
	public Accesorio(Long id, String nombre, String descripción, Float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.precio = precio;
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
