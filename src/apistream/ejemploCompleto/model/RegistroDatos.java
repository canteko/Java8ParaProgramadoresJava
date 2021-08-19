package apistream.ejemploCompleto.model;

import java.time.LocalDate;
import java.util.Objects;

public class RegistroDatos {
	
	private LocalDate fecha;
	private String estacionMeteorologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;
	
	/**
	 * 
	 */
	public RegistroDatos() {
	}

	/**
	 * @param fecha
	 * @param estacionMeteorologica
	 * @param provincia
	 * @param maxima
	 * @param minima
	 * @param precipitacion
	 */
	public RegistroDatos(LocalDate fecha, String estacionMeteorologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		this.fecha = fecha;
		this.estacionMeteorologica = estacionMeteorologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @return the estacionMeteorologica
	 */
	public String getEstacionMeteorologica() {
		return estacionMeteorologica;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @return the maxima
	 */
	public TemperaturaHora getMaxima() {
		return maxima;
	}

	/**
	 * @return the minima
	 */
	public TemperaturaHora getMinima() {
		return minima;
	}

	/**
	 * @return the precipitacion
	 */
	public float getPrecipitacion() {
		return precipitacion;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @param estacionMeteorologica the estacionMeteorologica to set
	 */
	public void setEstacionMeteorologica(String estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @param maxima the maxima to set
	 */
	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}

	/**
	 * @param minima the minima to set
	 */
	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}

	/**
	 * @param precipitacion the precipitacion to set
	 */
	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estacionMeteorologica, fecha, maxima, minima, precipitacion, provincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroDatos other = (RegistroDatos) obj;
		return Objects.equals(estacionMeteorologica, other.estacionMeteorologica) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(maxima, other.maxima) && Objects.equals(minima, other.minima)
				&& Float.floatToIntBits(precipitacion) == Float.floatToIntBits(other.precipitacion)
				&& Objects.equals(provincia, other.provincia);
	}

	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}
	
	

}
