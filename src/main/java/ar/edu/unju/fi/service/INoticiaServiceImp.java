/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * @author Windows
 *
 */
@Repository
public class INoticiaServiceImp implements INoticiaService {
@Autowired
private INoticia inoticia;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
      inoticia.guardar();
	}

	@Override
	public Noticia Mostrar() {
		Noticia noticia = inoticia.Mostrar();// TODO Auto-generated method stub
		return noticia;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
      inoticia.eliminar();
	}

	@Override
	public Noticia modificar() {
		// TODO Auto-generated method stub
		Noticia noticia= inoticia.modificar();
		return noticia;
	}

}
