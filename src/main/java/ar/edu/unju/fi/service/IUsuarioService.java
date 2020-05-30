package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;
/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi Fabian
 *
 */
public interface IUsuarioService {
	  public void guardar();
	   public Usuario Mostrar();
	   public void eliminar();
	   public Usuario modificar();
}
