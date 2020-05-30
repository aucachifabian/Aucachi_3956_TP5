/**
 * 
 */
package ar.edu.unju.fi.repository;
import ar.edu.unju.fi.model.Usuario;

/**
 * 
 * @author Aucachi Fabian
 * Se definiran que metodos se realizaran sobre el objeto con la que asociamos la interface
 */
public interface IUsuario {
   public void guardar();
   public Usuario Mostrar();
   public void eliminar();
   public Usuario modificar();

}
