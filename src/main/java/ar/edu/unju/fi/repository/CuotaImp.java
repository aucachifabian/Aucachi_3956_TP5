/**
 * 
 */
package ar.edu.unju.fi.repository;
import ar.edu.unju.fi.repository.ICuota;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Cuota;
/**
 * @author Aucachi Fabian
 *  implementacion. se escriben las acciones que realizaran los metodos de la interfaz asociada.
 */
@Repository("CuotaImp")
public class CuotaImp implements ICuota{
@Autowired
private Cuota cuota;

public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);

@Override
public void guardar() {
	  LOG.info(" Se ah guardado la cuota correctamente la cuota del usuario " + cuota.getUsuario() + 
		   " en la fecha : "  + cuota.getFechaPago().getYear()+"/"
		+ cuota.getFechaPago().getMonth() +"/" + cuota.getFechaPago().getDayOfMonth() );
}

@Override
public Cuota Mostrar() {
	// TODO Auto-generated method stub
	LOG.info("mostrar los datos de la cuota");
	return cuota;
}

@Override
public void eliminar() {
	// TODO Auto-generated method stub
	LOG.info("se elimino el contenido de la Bd");	
}

@Override
public Cuota modificar() {
	// TODO Auto-generated method stub
	LOG.info("se Modifico el contenido de la Bd");
	return cuota;
}



	
	

}
