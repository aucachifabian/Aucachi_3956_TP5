/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi fabian
 *
 */
public interface IResuladoService {
	   public void guardar();
	   public Resultado Mostrar();
	   public void eliminar();
	   public Resultado modificar();
}
