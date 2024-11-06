package cl.ufro.dci.Model;

import java.util.ArrayList;

public class Curso {

	private String nombre;
	private int horasSemanales;
	private Sala sala;
	private Profesor profesorAsignado;
	private ArrayList<Estudiante> estudiantesInscritos;

	/**
	 *
	 * @param nombre
	 * @param horasSemanales
	 * @param sala
	 * @param profesorAsignado
	 */
	public Curso(String nombre, int horasSemanales, Sala sala, Profesor profesorAsignado) {
		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
		this.sala = sala;
		this.profesorAsignado = profesorAsignado;
		this.estudiantesInscritos = new ArrayList<Estudiante>();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasSemanales() {
		return this.horasSemanales;
	}

	/**
	 * 
	 * @param horasSemanales
	 */
	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public Sala getSala() {
		return this.sala;
	}

	/**
	 * 
	 * @param sala
	 */
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Profesor getProfesorAsignado() {
		return this.profesorAsignado;
	}

	/**
	 * 
	 * @param profesorAsignado
	 */
	public void setProfesorAsignado(Profesor profesorAsignado) {
		this.profesorAsignado = profesorAsignado;
	}

	public ArrayList<Estudiante> getEstudiantesInscritos() {
		return this.estudiantesInscritos;
	}

}