package ar.edu.unju.fi.model;

public class Equipo {
  private String nombre;
  private Estadio estadio;

  
 public Equipo() {
	 
 }
  
  
  /**
 * @param nombre
 * @param estadio
 */
public Equipo(String nombre, Estadio estadio) {
	this.nombre = nombre;
	this.estadio = estadio;
}


/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}


/**
 * @return the estadio
 */
public Estadio getEstadio() {
	return estadio;
}


/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}


/**
 * @param estadio the estadio to set
 */
public void setEstadio(Estadio estadio) {
	this.estadio = estadio;
}
  

  
}
