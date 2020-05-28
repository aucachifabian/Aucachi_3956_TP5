/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

/**
 * @author Windows
 *
 */
@Repository
public class ICuotaServiceimp implements ICuotaService {
@Autowired
private ICuota icuota;
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
             icuota.guardar();
	}

	@Override
	public Cuota Mostrar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.Mostrar();
		return cuota;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
   icuota.eliminar();
	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
