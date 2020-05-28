/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * @author Windows
 *
 */
public interface IResultado {
	   public void guardar();
	   public Resultado Mostrar();
	   public void eliminar();
	   public Resultado modificar();
}
