package hashCode;

import java.util.Objects;

class Persona2 {
    // Estructura, conocida como propiedades o atributos
    String nombre;
    String apellidos;
    int edad;
    int altura;
    float peso;

    // Constructor con parametros
    public Persona2(String name, String appellidos, int edad, int altura, float peso) {
        this.nombre = name;
        this.apellidos = appellidos;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Constructor con parametros
    public Persona2(String name, String apellidos, int edad, int altura) {
    	this(name, apellidos, edad, altura, 80.0f);
    }
    
    // Constructor con parametros
    public Persona2(String name, String apellidos, int edad) {
    	this(name, apellidos, edad, 180, 80.0f);
    }
    
    // Constructor con parametros
    public Persona2(String name, String apellidos) {
    	this(name, apellidos, 50, 180, 80.0f);
    }
    
    // Constructor con parametros
    public Persona2(String name) {
    	this(name, "Doe", 50, 180, 80.0f);
    }

    // Constructor vacio
    public Persona2() {
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPeso(float peso) {
		this.peso = peso;
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
		Persona2 other = (Persona2) obj;
		return altura == other.altura && Objects.equals(apellidos, other.apellidos) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso);
	}
}