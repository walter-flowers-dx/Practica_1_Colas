package Ejercicio_1;
public class Principal {
    public static void main(String[] args) {
        ColaSimpleNum z = new ColaSimpleNum();
        z.adi(9);
        z.adi(1);
        z.adi(3);
        z.adi(2);
        z.adi(1);
        z.adi(4);
        z.adi(7);
        z.adi(5);
        z.adi(8);
        z.adi(3);

        z.mostrar();

        System.out.println("\nb) Eliminar todos aquellos numeros primos");
        eliPrimos(z);
        z.mostrar();
    }

    static void eliPrimos(ColaSimpleNum z) {
        ColaSimpleNum auxRestaurados = new ColaSimpleNum(); 
        while (!z.esVacia()) {
            int x = z.eli();
            if (!esPrimo(x)) {
                auxRestaurados.adi(x);
                System.out.println(x);
            }
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números <= 1 no son primos
        }
        if (numero == 2 || numero == 3) {
            return true; // 2 y 3 son primos
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; // Si es divisible por 2 o 3, no es primo
        }
        
        // Verifica otros divisores
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}