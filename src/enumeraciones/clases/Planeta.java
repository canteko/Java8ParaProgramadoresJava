package enumeraciones.clases;

public enum Planeta {
	
	MERCURIO(1231, 1231),
	VENUS(1232, 1232),
	TIERRA(1233, 1233),
	MARTE(1234, 1234),
	JUPITER(1235, 1235),
	SATURNO(1236, 1236),
	URANO(1237, 1237),
	NEPTUNO(1238, 1238);
	
	private final double masa;
	private final double radio;
	
	Planeta(double masa, double radio) {
		this.masa = masa;
		this.radio = radio;
	}
	
	double masa() { return this.masa; }
	double radio() { return this.radio; }
	
	public static final double G = 6.67300E-11;
	
	public double gravedadSuperficial() {
		return G * masa / (radio * radio);
	}
	
	public double pesoEnLaSuperficie(double otraMasa) {
		return otraMasa * gravedadSuperficial();
	}
}
