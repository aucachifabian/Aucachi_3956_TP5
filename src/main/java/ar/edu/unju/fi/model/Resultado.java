package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Resultado {
LocalDate fecha;
private Equipo equipo1;
private Equipo equipo2; 
private int golesEquipo1; 
private int golesEquipo2 ;

public Resultado() {
	
}

/**
 * @param fecha
 * @param equipo1
 * @param equipo2
 * @param golesEquipo1
 * @param golesEquipo2
 */
public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
	this.fecha = fecha;
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.golesEquipo1 = golesEquipo1;
	this.golesEquipo2 = golesEquipo2;
}

/**
 * @return the fecha
 */
public LocalDate getFecha() {
	return fecha;
}

/**
 * @return the equipo1
 */
public Equipo getEquipo1() {
	return equipo1;
}

/**
 * @return the equipo2
 */
public Equipo getEquipo2() {
	return equipo2;
}

/**
 * @return the golesEquipo1
 */
public int getGolesEquipo1() {
	return golesEquipo1;
}

/**
 * @return the golesEquipo2
 */
public int getGolesEquipo2() {
	return golesEquipo2;
}

/**
 * @param fecha the fecha to set
 */
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

/**
 * @param equipo1 the equipo1 to set
 */
public void setEquipo1(Equipo equipo1) {
	this.equipo1 = equipo1;
}

/**
 * @param equipo2 the equipo2 to set
 */
public void setEquipo2(Equipo equipo2) {
	this.equipo2 = equipo2;
}

/**
 * @param golesEquipo1 the golesEquipo1 to set
 */
public void setGolesEquipo1(int golesEquipo1) {
	this.golesEquipo1 = golesEquipo1;
}

/**
 * @param golesEquipo2 the golesEquipo2 to set
 */
public void setGolesEquipo2(int golesEquipo2) {
	this.golesEquipo2 = golesEquipo2;
}


}