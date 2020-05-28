/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.repository.IEstadio;
import ar.edu.unju.fi.model.Estadio;

/**
 * @author Windows
 *
 */
@Repository
public class IEstadioServiceImp implements IEstadioService {
@Autowired
private IEstadio iestadio;
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
   iestadio.guardar();
	}

	@Override
	public Estadio Mostrar() {
		// TODO Auto-generated method stub
		Estadio estadio = iestadio.Mostrar();
		return estadio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
     iestadio.eliminar();
	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
