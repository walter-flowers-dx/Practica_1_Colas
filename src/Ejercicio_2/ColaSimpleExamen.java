package Ejercicio_2;
import java.util.Scanner;

public class ColaSimpleExamen extends ColaExamen{

	public ColaSimpleExamen() {
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
	
	public void adi(Examen elem) {
		if(esLlena()) {
			System.out.println("Cola Simple Llena!!!");
		}else {
			fi++;
			v[fi] = elem;
		}
	}
	
	public Examen eli() {
		Examen elem = new Examen("",0.0,"");
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
	
	public void vaciar(ColaSimpleExamen z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for(int i = 1; i<= n; i++) {
			System.out.println("Intr, estudiante,calificacion,fechaNacimiento");
			String estudiante = lee.next();
			double calificacion = lee.nextDouble();
			String fechaNacimiento = lee.next();
			
			Examen x = new Examen(estudiante, calificacion, fechaNacimiento);
			adi(x);
		}
	}
	
	public void mostrar() {
		ColaSimpleExamen aux = new ColaSimpleExamen();
		Examen x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
	
}
