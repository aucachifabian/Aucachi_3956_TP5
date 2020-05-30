package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;
/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface IEquipo {
		   public void guardar();
		   public Equipo  Mostrar();
		   public void eliminar();
		   public Equipo modificar();

}

