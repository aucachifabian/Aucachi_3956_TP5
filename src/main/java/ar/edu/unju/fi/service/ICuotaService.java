package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;
/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi Fabian
 *
 */
public interface ICuotaService {
	public void guardar();
	   public Cuota Mostrar();
	   public void eliminar();
	   public Cuota modificar();
}
