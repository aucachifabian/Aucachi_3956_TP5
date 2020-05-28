package ar.edu.unju.fi.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Aucachi3956Tp5Application;
import ar.edu.unju.fi.model.Usuario;
@Repository("UsuarioImp")
public class UsuarioImp implements IUsuario {
@Autowired
private Usuario usuario;
public static Logger LOG = LoggerFactory.getLogger(Aucachi3956Tp5Application.class);

@Override
public void guardar() {
	// TODO Auto-generated method stub
	LOG.info("el usuario fue guardado " + usuario.getApellido() + ", " + usuario.getNombre());
}

@Override
public Usuario Mostrar() {
	// TODO Auto-generated method stub
	LOG.info("mostrar los datos del usuario :");
	return usuario;
}

@Override
public void eliminar() {
	// TODO Auto-generated method stub
	LOG.info("se elimino el contenido de la Bd");
}

@Override
public Usuario modificar() {
	// TODO Auto-generated method stub
	LOG.info("se modifico los datos del usuario ");
	return null;
}


}
