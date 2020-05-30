/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * implementacion, este llamara las interfaz del repositorio de cada objeto. para trabajar en capaz
 * @author Aucachi Fabian
 *
 */
@Repository
public class IResuladoServiceImp implements IResuladoService {
	@Autowired
	public IResultado iresultado;
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
      iresultado.guardar();
	}

	@Override
	public Resultado Mostrar() {
		// TODO Auto-generated method stub
		Resultado resultado = iresultado.Mostrar();
		return resultado;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
       iresultado.eliminar();
	}

	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
