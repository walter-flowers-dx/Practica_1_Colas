package Ejercicio_2;

public class Examen {
	String estudiante;
	double calificacion;
	String fechaNacimiento;
	
	public Examen(String estudiante, double calificacion, String fechaNacimiento) {
		super();
		this.estudiante = estudiante;
		this.calificacion = calificacion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Examen [estudiante=" + estudiante + ", calificacion=" + calificacion + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
