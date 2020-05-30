/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * @author Aucachi Fabian
 *  implementacion. se escriben las acciones que realizaran los metodos de la interfaz asociada.
 */
@Repository
public class ResultadoImp implements IResultado {
@Autowired
Resultado resultado;
public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);
  
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
   LOG.info("Se guardo el contenido Resultado de la fecha " + resultado.getFecha());
	}

	@Override
	public Resultado Mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Se muestra el resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
    LOG.info("Se elimino el contenido resultado");
	}

	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		LOG.info("Se modifico el resultado");
		return resultado;
	}
}
