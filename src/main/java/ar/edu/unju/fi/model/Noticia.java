package ar.edu.unju.fi.model;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
/**
 * class que representa al objeto Noticia contiene FECHA DE LA NOTICIA, TITULO Y UNA BREVE DESCRIPCION
 * @author Aucachi Fabian
 *
 */
@Component
public class Noticia {
private LocalDate fecha;
private String titulo;
private String resumen;

public Noticia() {
	
}

/**
 * @param fecha
 * @param titulo
 * @param resumen
 */
public Noticia(LocalDate fecha, String titulo, String resumen) {
	this.fecha = fecha;
	this.titulo = titulo;
	this.resumen = resumen;
}

/**
 * @return the fecha
 */
public LocalDate getFecha() {
	return fecha;
}

/**
 * @return the titulo
 */
public String getTitulo() {
	return titulo;
}

/**
 * @return the resumen
 */
public String getResumen() {
	return resumen;
}

/**
 * @param fecha the fecha to set
 */
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

/**
 * @param titulo the titulo to set
 */
public void setTitulo(String titulo) {
	this.titulo = titulo;
}

/**
 * @param resumen the resumen to set
 */
public void setResumen(String resumen) {
	this.resumen = resumen;
}


}
