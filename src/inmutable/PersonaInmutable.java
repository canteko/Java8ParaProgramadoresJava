package inmutable;

import java.util.Objects;

final public class PersonaInmutable {
    // Estructura, conocida como propiedades o atributos
    final private String nombre;
    final private String apellidos;
    final private int edad;
    final private int altura;
    final private float peso;

    // Constructor con parametros
    public PersonaInmutable(final String name, final String appellidos, final int edad, final int altura, final float peso) {
        this.nombre = name;
        this.apellidos = appellidos;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Constructor con parametros
    public PersonaInmutable(String name, String apellidos, int edad, int altura) {
    	this(name, apellidos, edad, altura, 80.0f);
    }
    
    // Constructor con parametros
    public PersonaInmutable(String name, String apellidos, int edad) {
    	this(name, apellidos, edad, 180, 80.0f);
    }
    
    // Constructor con parametros
    public PersonaInmutable(String name, String apellidos) {
    	this(name, apellidos, 50, 180, 80.0f);
    }
    
    // Constructor con parametros
    public PersonaInmutable(String name) {
    	this(name, "Doe", 50, 180, 80.0f);
    }

    // Constructor vacio
    public PersonaInmutable() {
        this("John", "Doe", 50, 180, 80.0f);
    }

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}

	// Comportamiento, conocido como metodos
    void caminar() {
        System.out.println("Estoy caminando");
    }
    void hablar() {
        System.out.println("Estoy hablando");
    }
    void nacer() {
        System.out.println("¡¡Acabo de nacer!!");
    }
    void morir() {
        System.out.println("Me muero");
    }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, apellidos, edad, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaInmutable other = (PersonaInmutable) obj;
		return altura == other.altura && Objects.equals(apellidos, other.apellidos) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso);
	}
}
