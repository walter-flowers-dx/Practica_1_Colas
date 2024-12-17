package Ejercicio_3;

import java.util.Scanner;

public class Transaccion {
	String tipo;
	double monto;
	Cuenta cuenta;
	
	public Transaccion(String tipo, double monto, Cuenta cuenta) {
		super();
		this.tipo = tipo;
		this.monto = monto;
		this.cuenta = cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: tipo,monto,datosCuenta");
		tipo = lee.next();
		monto = lee.nextDouble();
		cuenta.leer();
	}
	
	public void mostrar() {
		System.out.println("Datos de la Transaccion: ");
		System.out.println("Tipo: " + tipo);
		System.out.println("Monto: " + monto);
		cuenta.mostrar();
	}
}
