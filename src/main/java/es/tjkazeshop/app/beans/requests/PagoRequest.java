package es.tjkazeshop.app.beans.requests;

import java.math.BigDecimal;

public class PagoRequest {
	    private BigDecimal cantidad;
	    private String numeroTarjeta;
	    private String fechaCaducidad;
	    private String cvv;
		public PagoRequest(BigDecimal cantidad, String numeroTarjeta, String fechaCaducidad, String cvv) {
			super();
			this.cantidad = cantidad;
			this.numeroTarjeta = numeroTarjeta;
			this.fechaCaducidad = fechaCaducidad;
			this.cvv = cvv;
		}
		public PagoRequest() {
			super();
		}
		public BigDecimal getCantidad() {
			return cantidad;
		}
		public void setCantidad(BigDecimal cantidad) {
			this.cantidad = cantidad;
		}
		public String getNumeroTarjeta() {
			return numeroTarjeta;
		}
		public void setNumeroTarjeta(String numeroTarjeta) {
			this.numeroTarjeta = numeroTarjeta;
		}
		public String getFechaCaducidad() {
			return fechaCaducidad;
		}
		public void setFechaCaducidad(String fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}
		public String getCvv() {
			return cvv;
		}
		public void setCvv(String cvv) {
			this.cvv = cvv;
		}
	    
}
