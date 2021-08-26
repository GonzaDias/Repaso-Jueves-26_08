package proybotellaspk;

public class Botella {
	private double precio;
	private String tipo;
	
	public Botella(double precio, String tipo) {
		this.precio = precio;
		this.tipo = tipo;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return "PRECIO: "+this.precio+"TIPO: "+this.tipo; 
	
	}
}
