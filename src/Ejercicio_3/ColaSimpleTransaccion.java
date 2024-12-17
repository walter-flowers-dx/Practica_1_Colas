package Ejercicio_3;
import java.util.Scanner;

public class ColaSimpleTransaccion extends ColaTransaccion{

	public ColaSimpleTransaccion() {
		super();
	}
	
	public boolean esVacia() {
		if(fr == fi) 
			return true;
		return false;
	}
	
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	
	public void adi(Transaccion elem) {
		if(esLlena()) {
			System.out.println("Cola Simple Llena!!!");
		}else {
			fi++;
			v[fi] = elem;
		}
	}
	
	public Transaccion eli() {
		Transaccion elem = new Transaccion("",0.0,null);
		if(esVacia()) {
			System.out.println("Cola Simple Vacia!!!");
		}else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	
	public int nroElem() {
		return (fi - fr);
	}
	
	public void vaciar(ColaSimpleTransaccion z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for(int i = 1; i<= n; i++) {
			System.out.println("Intr, tipo,monto,");
			String tipo = lee.next();
			double monto = lee.nextDouble();
			
			Transaccion x = new Transaccion(tipo, monto, null);
			adi(x);
		}
	}
	
	public void mostrar() {
		System.out.println("Datos de la Cola!!!");
		ColaSimpleTransaccion aux = new ColaSimpleTransaccion();
		Transaccion x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	
}
