package clases.locales;

import java.util.Objects;

class Persona {
    // Estructura, conocida como propiedades o atributos
    String nombre;
    String apellidos;
    String nif;
    int edad;
    int altura;
    float peso;

    // Constructor con parametros
    public Persona(String name, String appellidos, String nif, int edad, int altura, float peso) {
        this.nombre = name;
        this.apellidos = appellidos;
        this.nif = nif;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Constructor con parametros
    public Persona(String name, String apellidos, String nif, int edad, int altura) {
    	this(name, apellidos, nif, edad, altura, 80.0f);
    }
    
    // Constructor con parametros
    public Persona(String name, String apellidos, String nif, int edad) {
    	this(name, apellidos, nif, edad, 180, 80.0f);
    }
    
    // Constructor con parametros
    public Persona(String name, String apellidos, String nif) {
    	this(name, apellidos, nif, 50, 180, 80.0f);
    }
    
    // Constructor con parametros
    public Persona(String name, String apellidos) {
    	this(name, apellidos, "12345678Z", 50, 180, 80.0f);
    }
    
    // Constructor con parametros
    public Persona(String name) {
    	this(name, "Doe", "12345678Z", 50, 180, 80.0f);
    }

    // Constructor vacio
    public Persona() {
        this("John", "Doe", "12345678Z", 50, 180, 80.0f);
    }

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	public String getNif() {
		return nif;
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
	
	public void setNif(String nif) {
		this.nif = nif;
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
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", edad=" + edad + ", altura=" + altura
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
		Persona other = (Persona) obj;
		return altura == other.altura && Objects.equals(apellidos, other.apellidos) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Objects.equals(nif, other.nif)
				&& Float.floatToIntBits(peso) == Float.floatToIntBits(other.peso);
	}
	
	public static boolean validarNif(String nif) {
		int longitud = 9;
		int longitudSinLetra = 8;
		
		if (nif.length() != longitud) {
			return false;
		}
		
		
		class Nif {
			String nifValido = null;
			final String[] arrayLetrasNIF = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
					"V", "H", "L", "C", "K", "E" };
			
			Nif(String nifSinLetra) {
				if (nif.length() != longitud) {
					nifValido = null;
				} else {
					try {
						nifValido = nifSinLetra + arrayLetrasNIF[Integer.parseInt(nifSinLetra) % 23];
					} catch(Exception e) {
						nifValido = null;
					}
				}
			}
			
			public String getNif() {
				return nifValido;
			}
		}
		
		Nif n = new Nif(nif.substring(0, nif.length() - 1));
		
		return nif.equalsIgnoreCase(n.getNif());

	}
}