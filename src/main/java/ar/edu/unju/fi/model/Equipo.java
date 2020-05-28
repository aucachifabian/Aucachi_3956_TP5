package ar.edu.unju.fi.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * clase equipo permite representar al obj esquipo 
 * @author Aucachi Fabian
 */
@Component
public class Equipo {
/**
 * variable miembro Nombre
 */
  private String nombre;
  /**
   * variable nombre estadio de tipo estadio
   */
  @Autowired
  private Estadio estadio;

 /**
  * constructor por defect
  */
 public Equipo() {
	 
 }
  
  
  /**
 * Constructor sobrecargado
 * @param nombre
 * @param estadio
 */
public Equipo(String nombre, Estadio estadio) {
	this.nombre = nombre;
	this.estadio = estadio;
}


/**
 * PERMITE LEER VARIABLE MIEMBRO
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}


/**
 * PERMITE LEER LA VARIABLE MIEMBRO
 * @return the estadio
 */
public Estadio getEstadio() {
	return estadio;
}


/**
 * PERMITE EL CAMBIO DE LA VARIABLE MIEMBRO
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}


/**
 * PERMITE EL CAMBIO DE LA VARIABLE MIEMBRO
 * @param estadio the estadio to set
 */
public void setEstadio(Estadio estadio) {
	this.estadio = estadio;
}
  

  
}
