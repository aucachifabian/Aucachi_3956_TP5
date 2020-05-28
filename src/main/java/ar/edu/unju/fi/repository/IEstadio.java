package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

public interface IEstadio {
	   public void guardar();
	   public Estadio Mostrar();
	   public void eliminar();
	   public Estadio modificar();
}
