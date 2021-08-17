package encapsulacion.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaDeNacimiento;
	
	public Persona () {
		
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param fechaDeNacimiento
	 */
	public Persona(String dni, String nombre, String apellidos, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the fechaDeNacimiento
	 */
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, fechaDeNacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(fechaDeNacimiento, other.fechaDeNacimiento) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}
}
