package es.tjkazeshop.app.beans;

public class Pago {
	private int cantidadComprada;
	private int idArticulo;
	public Pago(int cantidadComprada, int idArticulo) {
		super();
		this.cantidadComprada = cantidadComprada;
		this.idArticulo = idArticulo;
	}
	public int getCantidadComprada() {
		return cantidadComprada;
	}
	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	
}
