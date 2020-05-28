/**
 * 
 */
package ar.edu.unju.fi.repository;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Aucachi Fabian
 *
 */
public interface IUsuario {
   public void guardar();
   public Usuario Mostrar();
   public void eliminar();
   public Usuario modificar();

}
