/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface IResultado {
	   public void guardar();
	   public Resultado Mostrar();
	   public void eliminar();
	   public Resultado modificar();
}
