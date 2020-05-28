package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Equipo;

@Repository("EquipoImp")
public class EquipoImp implements IEquipo {
	@Autowired
	private Equipo equipo;
	public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info(" Se guardo los datos del equipo correctamente : " + equipo.getNombre());
       
	}

	@Override
	public Equipo Mostrar() {
		LOG.info(" Mostrando datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info(" Se elimino el equipo de la bd"); 
	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		LOG.info("Se modificaron los datos del equipo");
		return equipo;
	}

}
