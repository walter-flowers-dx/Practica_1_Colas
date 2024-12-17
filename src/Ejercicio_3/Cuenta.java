package Ejercicio_3;

import java.util.Scanner;

public class Cuenta {
	String nombre;
	Titular titular;
	
	public Cuenta(String nombre, Titular titular) {
		super();
		this.nombre = nombre;
		this.titular = titular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre,DatosTitular");
		nombre = lee.next();
		titular.leer();
	}
	
	public void mostrar() {
		System.out.println("Datos de la Cuenta:");
		System.out.println("Nombre: " + nombre);
		titular.mostrar();
	}
}
