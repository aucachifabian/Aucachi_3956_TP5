package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;
/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface IEstadio {
	   public void guardar();
	   public Estadio Mostrar();
	   public void eliminar();
	   public Estadio modificar();
}
