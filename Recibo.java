package proybotellaspk;

import java.time.LocalDate;
import java.util.*;
public class Recibo {
	private int nroRecibo;
	private LocalDate fecha;
	private double montoCobrar;
	private ArrayList<Botella> botellas = new ArrayList();
	private int cantBotellas;
	private static int cont;
	
	public Recibo() {
		this.nroRecibo = ++Recibo.cont;
		this.fecha = LocalDate.now();
	}
	
	public void Ingresar(Botella bot) {
		this.botellas.add(bot);
		this.cantBotellas += 1;
	}
	public double calcularTotal() {
		for(int x=0 ; x<botellas.size() ; x++) {
			this.montoCobrar = this.botellas.get(x).getPrecio() + this.montoCobrar;
		}
		return this.montoCobrar;
	}
	public String toString() {
		return "NRO RECIBO: "+this.nroRecibo+
			   " FECHA: "+this.fecha+
			   " CANT BOTELLAS: "+this.cantBotellas+
			   " A COBRAR: "+this.montoCobrar;
	}
}
