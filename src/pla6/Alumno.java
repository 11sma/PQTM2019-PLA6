package pla6;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import pla6.validation.ValidarDni;
import pla6.validation.ValidarMail;


public class Alumno {

	@NotNull
	@Size(min = 3,message = "Debe introducir el nombre del alumno")
	private String nombre;
	
	@Pattern(regexp="[A-Z]{1}\\d{8}",message="NIF incorrecto")
	private String nif;
	
	@ValidarDni
	private String dni;
	
	@ValidarMail
	private String mail;
	
	private String becado;
	
	private String[] asignaturas;

	private Map<String, String> listaBecado;
	
	private Map<String, String> listaAsignaturas;
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	public String[] getAssignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public String getBecado() {
		return becado;
	}

	public void setBecado(String becado) {
		this.becado = becado;
	}


	public Map<String, String> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public Map<String, String> getListaBecado() {
		return listaBecado;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public Alumno() {
		super();

		listaBecado = new LinkedHashMap<String, String>();
		listaBecado.put("N", "No");
		listaBecado.put("S", "Si");

		listaAsignaturas = new LinkedHashMap<String, String>();
		listaAsignaturas.put("js", "js");
		listaAsignaturas.put("Java", "Java");
		listaAsignaturas.put(".net", ".net");
		listaAsignaturas.put("php", "php");
	}

}
