/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;


/**
 * @author Windows
 *
 */
@Repository
public class IEquipoServiceImp implements IEquipoService {
@Autowired
private IEquipo iequipo;
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
   iequipo.guardar();
	}

	@Override
	public Equipo Mostrar() {
		Equipo equipo = iequipo.Mostrar();
		// TODO Auto-generated method stub
		return equipo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
     iequipo.eliminar();
	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
