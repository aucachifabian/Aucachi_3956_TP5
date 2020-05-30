package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Noticia;
/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi Fabian
 *
 */
public interface INoticiaService {
	public void guardar();
	   public Noticia Mostrar();
	   public void eliminar();
	   public Noticia modificar();
}
