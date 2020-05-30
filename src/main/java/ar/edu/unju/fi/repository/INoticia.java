package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;
/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface INoticia {
	public void guardar();
	   public Noticia Mostrar();
	   public void eliminar();
	   public Noticia modificar();
}
