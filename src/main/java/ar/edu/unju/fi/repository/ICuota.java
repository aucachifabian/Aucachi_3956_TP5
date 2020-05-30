package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;
/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface ICuota {
	public void guardar();
	   public Cuota Mostrar();
	   public void eliminar();
	   public Cuota modificar();
}
