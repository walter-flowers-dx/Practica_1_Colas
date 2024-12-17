package Ejercicio_3;

public class Principal {

	public static void main(String[] args) {
		Titular ti1 = new Titular("Marco","12345");
		Cuenta c1 = new Cuenta("10000041327",ti1);
		Transaccion tra1 = new Transaccion("Deposito",1000,c1);
		
		Titular ti2 = new Titular("Carla","67809");
		Cuenta c2 = new Cuenta("10000082537",ti2);
		Transaccion tra2 = new Transaccion("Pago de Impuestos",200,c2);
		
		Titular ti3 = new Titular("Danna","10111");
		Cuenta c3 = new Cuenta("10000013263",ti3);
		Transaccion tra3 = new Transaccion("Pago de Luz",300,c3);
		
		Titular ti4 = new Titular("Rodrigo","98253");
		Cuenta c4 = new Cuenta("10000092634",ti4);
		Transaccion tra4 = new Transaccion("Deposito",50000,c4);
		
		Titular ti5 = new Titular("Jhamil","22151");
		Cuenta c5 = new Cuenta("10000083537",ti5);
		Transaccion tra5 = new Transaccion("Pago de gas domiciliario",100,c5);
		
		ColaSimpleTransaccion colaTra = new ColaSimpleTransaccion();
		colaTra.adi(tra1);
		colaTra.adi(tra2);
		colaTra.adi(tra3);
		colaTra.adi(tra4);
		colaTra.adi(tra5);
		
		colaTra.mostrar();
		
		System.out.println("*******************************************************************************");
        System.out.println("B) Mostrar la transacción con el monto más bajo en una cuenta específica:");
        mostrarTransaccionMenorMonto(colaTra, "10000083537"); // Ejemplo para la cuenta "10000041327"
        
        System.out.println("*******************************************************************************");
        System.out.println("D) Mostrar transacciones realizadas por un titular con un DNI específico:");
        mostrarTransaccionesPorDNI(colaTra, "12345"); // Ejemplo para el DNI "12345"
	}

	// D)
	public static void mostrarTransaccionesPorDNI(ColaSimpleTransaccion cola, String dni) {
	    if (cola.esVacia()) {
	        System.out.println("Cola de transacciones vacía");
	        return;
	    }
	    ColaSimpleTransaccion aux = new ColaSimpleTransaccion();
	    while (!cola.esVacia()) {
	        Transaccion actual = cola.eli();
	        if (actual.getCuenta().getTitular().getDni().equals(dni)) {
	            actual.mostrar();
	        }
	        aux.adi(actual); 
	    }
	    cola.vaciar(aux); 
	}

	// B) 
	public static void mostrarTransaccionMenorMonto(ColaSimpleTransaccion cola, String numeroCuenta) {
	    if (cola.esVacia()) {
	        System.out.println("Cola de transacciones vacía");
	        return;
	    }
	    ColaSimpleTransaccion aux = new ColaSimpleTransaccion();
	    Transaccion transaccionMenor = null;
	    
	    while (!cola.esVacia()) {
	        Transaccion actual = cola.eli();
	        
	        if (actual.getCuenta().getNombre().equals(numeroCuenta)) {
	            if (transaccionMenor == null || actual.getMonto() < transaccionMenor.getMonto()) {
	                transaccionMenor = actual;
	            }
	        }
	        aux.adi(actual); 
	    }
	    
	    cola.vaciar(aux);

	    if (transaccionMenor != null) {
	        System.out.println("Transacción con el menor monto en la cuenta " + numeroCuenta + ":");
	        transaccionMenor.mostrar();
	    } else {
	        System.out.println("No se encontraron transacciones para la cuenta " + numeroCuenta);
	    }
	}
}

