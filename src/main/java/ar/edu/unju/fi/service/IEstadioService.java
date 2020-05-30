package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;
/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi Fabian
 *
 */
public interface IEstadioService {
	   public void guardar();
	   public Estadio Mostrar();
	   public void eliminar();
	   public Estadio modificar();
}
