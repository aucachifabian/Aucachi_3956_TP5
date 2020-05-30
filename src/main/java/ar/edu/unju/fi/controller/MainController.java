/**
 * 
 */
package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;
/**
 * @author Aucachi Fabian
 *el programa la clase principal de control. aqui es donde especificamos que atrubutos o valores vamos a mostrar en el archivo html
 *en este caso al atributo usuario le agregamos el nombre asignado en el programa principal(donde arrancamos el proyecto)
 *y esto se muestra en el html a travez de la variable usuario.
 */
@Controller
public class MainController {
   //inyectaremos la dependencia a un usuario de tipo IUsuarioService. para poder solisitar sus servicios
	@Autowired
	private IUsuarioService usuarioService;
	
	//http://localhost:8080/home
	
	@RequestMapping("/")
	public String Main(Model model) {
		model.addAttribute("usuario",usuarioService.Mostrar().getNombre());
		return "index";
}
}