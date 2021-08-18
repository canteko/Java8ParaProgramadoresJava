package enumeraciones.basico;

public class EjemploSemana {

	public static void main(String[] args) {
		saludaSegunDia(DiaSemana.LUNES);
		saludaSegunDia(DiaSemana.JUEVES);
		saludaSegunDia(DiaSemana.DOMINGO);
		saludaSegunDia(DiaSemana.VIERNES);

	}
	
	public static void saludaSegunDia(DiaSemana d) {
		switch(d) {
		case LUNES:
			System.out.println("Vaya mierda");
			break;
		case SABADO: case DOMINGO:
			System.out.println("Finde");
			break;
		case VIERNES:
			System.out.println("Oma vierneeee");
			break;
		default:
			System.out.println("Vaya semana mas larga");
			break;
		}
	}

}
