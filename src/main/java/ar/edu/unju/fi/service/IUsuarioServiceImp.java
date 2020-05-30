package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.repository.IUsuario;
import ar.edu.unju.fi.model.Usuario;
/**
 * implementacion, este llamara las interfaz del repositorio de cada objeto. para trabajar en capaz
 * @author Aucachi Fabian
 *
 */
@Repository
public class IUsuarioServiceImp implements IUsuarioService{
@Autowired
public IUsuario iusuario;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iusuario.guardar();
		
	}

	@Override
	public Usuario Mostrar() {
		// TODO Auto-generated method stub
	   Usuario usuario= iusuario.Mostrar();
	return usuario;
	}

	@Override
	public void eliminar() {
		iusuario.eliminar();
	}

	@Override
	public Usuario modificar() {
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
