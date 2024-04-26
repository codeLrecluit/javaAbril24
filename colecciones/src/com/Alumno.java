package com;

public class Alumno {

	String nombre;
	int edad;
	String numeroControl;
	String procedencia;
	String sexo;
	String carrera;
	public Alumno() {
	}
	public Alumno(String nombre, int edad, String numeroControl, String procedencia, String sexo, String carrera) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numeroControl = numeroControl;
		this.procedencia = procedencia;
		this.sexo = sexo;
		this.carrera = carrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNumeroControl() {
		return numeroControl;
	}
	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", numeroControl=" + numeroControl + ", procedencia="
				+ procedencia + ", sexo=" + sexo + ", carrera=" + carrera + "]";
	}
	
	
	
}
