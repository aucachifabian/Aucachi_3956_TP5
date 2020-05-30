package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;
/**
 * interface del servicio especiifica los servicios que podremos realizar
 * @author Aucachi Fabian
 *
 */
public interface IEquipoService {
		   public void guardar();
		   public Equipo  Mostrar();
		   public void eliminar();
		   public Equipo modificar();

}

