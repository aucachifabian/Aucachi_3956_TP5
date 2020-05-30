/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Aucachi Fabian
 *  implementacion. se escriben las acciones que realizaran los metodos de la interfaz asociada.
 */
@Repository
public class EstadioImp implements IEstadio {
   @Autowired
	private Estadio estadio;
	public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);
   
@Override
public void guardar() {
	// TODO Auto-generated method stub
	LOG.info("se guardaron los datos del estadio :" + estadio.getNombre());
}

@Override
public Estadio Mostrar() {
	// TODO Auto-generated method stub
	LOG.info("Se mostraran los datos del estadio :");
	return estadio;
}

@Override
public void eliminar() {
	// TODO Auto-generated method stub
	LOG.info("se elimino el estadio de la bd");
}

@Override
public Estadio modificar() {
	// TODO Auto-generated method stub
	LOG.info("se modificaran los datos del estadio : " + estadio.getNombre());
	return estadio;
}
}
