package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Aucachi3956Tp5Application implements CommandLineRunner{  //esta implementacion me agrego el void run
   @Autowired
	IUsuarioService usuarioService;
   @Autowired
   Usuario usuario;
	public static void main(String[] args) {
		SpringApplication.run(Aucachi3956Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LocalDate fechaNac = LocalDate.of(1999, 3, 1);
		//Vamos a agregar todos los valores a nuestro objeto Usuario.
		usuario.setApellido("Aucachi");
		usuario.setNombre("Fabian");
		usuario.setDni(41679474);
		usuario.setDireccion("Mza Ap 1 Lote 11 Barrio Administracion");
		usuario.setFechaNacimiento(fechaNac);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setTipo("SOCIO");
		usuario.setId(1);
		usuario.setPassword("12345678");
		
		usuarioService.guardar();
		usuarioService.Mostrar();
	}

}
