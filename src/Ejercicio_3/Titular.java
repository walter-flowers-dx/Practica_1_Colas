package Ejercicio_3;

import java.util.Scanner;

public class Titular {
	String nombre;
	String dni;
	
	public Titular(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre, dni");
		nombre = lee.next();
		dni = lee.next();
	}
	
	public void mostrar() {
		System.out.println("Datos del Titular: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
	}
}
