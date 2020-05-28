/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Noticia;

/**
 * @author Windows
 *
 */
@Repository("NoticiaImp")
public class NoticiaImp implements INoticia {
@Autowired
private Noticia noticia;
public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);

@Override
public void guardar() {
	// TODO Auto-generated method stub
	LOG.info(" Se guardo la noticia correctament" + noticia.getTitulo());
}

@Override
public Noticia Mostrar() {
	// TODO Auto-generated method stub
	LOG.info("mostraremos la noticia");
	return noticia;
}

@Override
public void eliminar() {
	// TODO Auto-generated method stub
	LOG.info("Se elimino la noticia");
}

@Override
public Noticia modificar() {
	// TODO Auto-generated method stub
	LOG.info("modificaremos la noticia");
	return noticia;
}

}
