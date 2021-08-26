package proybotellaspk;

public class Principal {
	public static void main(String [] args) {
		Botella b1 = new Botella(70, "Vidrio");
		Botella b2 = new Botella(50, "Plastico");
		
		Recibo r1 = new Recibo();
		
		r1.Ingresar(b1);
		r1.Ingresar(b2);
		r1.calcularTotal();
		
		System.out.println(r1);
	}
}
