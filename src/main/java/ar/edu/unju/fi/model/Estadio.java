package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Estadio {
	private String nombre;
	 private LocalDate fechaFundacion;
	private String ciudad;
	 private int capacidad;
	 private String dirección;
	 
	 public Estadio() {
		 
	 }

	/**
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param dirección
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String dirección) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.dirección = dirección;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @return the dirección
	 */
	public String getDirección() {
		return dirección;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @param dirección the dirección to set
	 */
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	 
	 
}
