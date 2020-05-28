package ar.edu.unju.fi.model;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
/**
 * clase Cuota, reprecenta al objeto, contiene todo lo nesesario para almacenar un pago.
 * @author Aucachi Fabian
 *
 */
@Component
public class Cuota {
	/**
	 * Variable miembro para reresentar el id de una cuota
	 */
	private long id;
	/**
	 * Variable miembro para reresentar la fecha en la que se paga la cuota
	 */
	private LocalDate fechaPago;
	/**
	 * Variable miembro para reresentar el periodo de pago
	 */
	private String periodo;
	/**
	 * Variable miembro para reresentar el monto pagado
	 */
	private double monto;
	/**
	 * Variable miembro
	 */
	private String estado;
	/**
	 * Variable miembro para reresentar el nombr de usuario
	 */
	private Usuario usuario;
	
	/**
	 * constructor por defecto
	 */
	public Cuota() {
		
	}
	
	
	/**
	 * 	constructor sobrecargado con parametros
	 * @param id
	 * @param fechaPago
	 * @param periodo
	 * @param monto
	 * @param estado
	 * @param usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}
	
	
	/**
	 * metodo Getter permite leer Id
	 * @return the id
	 * 
	 */
	public long getId() {
		return id;
	}
	/**
	 * metodo getter permite leer la fecha de pago
	 * @return the fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	/**
	 * permite leer el period
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}
	/**
	 * permite leer el monto
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}
	/**
	 * permite leer el estado
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * permite leer el usuario
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * permite Cambiar el id
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * permite cambiar la fecha de pago
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	/**
	 * permite cambiar el period
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	/**
	 * permite cambiar el monto
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}
	/**
	 * permite cambiar el estado
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * permite cambiar el usuario
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
