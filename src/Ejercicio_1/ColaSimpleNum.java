package Ejercicio_1;
import java.util.Scanner;

public class ColaSimpleNum extends ColaNum{

	public ColaSimpleNum() {
		super();
	}
	public boolean esVacia() {
		return fr == fi;
	}
	public boolean esLlena() {
		return fi == MAX-1;
	}
	public void adi(int elem) {
		if(esLlena())
			System.out.println("Cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public int eli() {
		int elem = 0;
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return fi - fr;
	}
	public void vaciar(ColaSimpleNum z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. numero");
			int x = lee.nextInt();
			adi(x);
		}
	}
	public void mostrar() {
		ColaSimpleNum aux = new ColaSimpleNum();
		int x;
		while(!esVacia()) {
			x = eli();
			System.out.print(x + "\t");
			aux.adi(x);
		}
		reiniciar();
		vaciar(aux);
	}
	public void reiniciar() {
		this.fi = -1;
		this.fr = -1;
	}
}
