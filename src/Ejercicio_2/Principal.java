package Ejercicio_2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Principal {

    public static void main(String[] args) {
        ColaSimpleExamen ce = new ColaSimpleExamen();
        
        Examen e1 = new Examen("Pedro", 45.5, "12-01-2010");
        Examen e2 = new Examen("Danna", 80.7, "27-05-2002");
        Examen e3 = new Examen("Mario", 50.5, "31-12-2015");
        Examen e4 = new Examen("Karla", 77, "12-08-2004");
        Examen e5 = new Examen("Carlos", 100, "02-01-2000");
        
        ce.adi(e1);
        ce.adi(e2);
        ce.adi(e3);
        ce.adi(e4);
        ce.adi(e5);
    
        System.out.println("Mostrar todos los exámenes:");
        ce.mostrar();
        
        System.out.println("\nA) Mostrar la calificación más baja:");
        mostrarCalificacionBaja(ce);
        
        System.out.println("\nB) Mostrar todos los estudiantes que aprobaron y tienen más de 15 años:");
        mostrarAprobadosMayoresDe15(ce);
    }

    static void mostrarCalificacionBaja(ColaSimpleExamen x) {
        ColaSimpleExamen aux = new ColaSimpleExamen();
        Examen menorExamen = null;
        
        while (!x.esVacia()) {
            Examen y = x.eli();
            if (menorExamen == null || y.getCalificacion() < menorExamen.getCalificacion()) {
                menorExamen = y;
            }
            aux.adi(y); 
        }
        
        if (menorExamen != null) {
            System.out.println("La calificación más baja es: " + menorExamen.getCalificacion());
        }
        x.vaciar(aux);
    }

    static void mostrarAprobadosMayoresDe15(ColaSimpleExamen x) {
        ColaSimpleExamen aux = new ColaSimpleExamen();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate today = LocalDate.now();
        
        while (!x.esVacia()) {
            Examen y = x.eli();
            LocalDate fechaNacimiento = LocalDate.parse(y.getFechaNacimiento(), formatter);
            int edad = Period.between(fechaNacimiento, today).getYears();
            if (y.getCalificacion() >= 51 && edad > 15) {
                System.out.println("Estudiante: " + y.getEstudiante() + ", Calificación: " + y.getCalificacion() + ", Edad: " + edad);
            }
        }
        x.vaciar(aux);
    }
}
