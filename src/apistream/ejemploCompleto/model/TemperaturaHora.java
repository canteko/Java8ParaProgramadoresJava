package apistream.ejemploCompleto.model;

import java.time.LocalTime;
import java.util.Objects;

public class TemperaturaHora {

	private float temperatura;
	private LocalTime hora;
	
	/**
	 * 
	 */
	public TemperaturaHora() {
	}
	/**
	 * @param temperatura
	 * @param hora
	 */
	
	public TemperaturaHora(float temperatura, LocalTime hora) {
		this.temperatura = temperatura;
		this.hora = hora;
	}
	
	/**
	 * @return the temperatura
	 */
	public float getTemperatura() {
		return temperatura;
	}
	
	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}
	
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hora, temperatura);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemperaturaHora other = (TemperaturaHora) obj;
		return Objects.equals(hora, other.hora)
				&& Float.floatToIntBits(temperatura) == Float.floatToIntBits(other.temperatura);
	}
	
	@Override
	public String toString() {
		return "TemperaturaHora [temperatura=" + temperatura + ", hora=" + hora + "]";
	}	
}
