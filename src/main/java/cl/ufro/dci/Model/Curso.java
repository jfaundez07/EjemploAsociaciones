package cl.ufro.dci.Model;

public class Curso {

	private String nombre;
	private int horasSemanales;
	private Sala sala;
	private Profesor profesorAsignado;
	private java.util.ArrayList<Estudiante> estudiantesInscritos;

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

	/**
	 * 
	 * @param nombre
	 * @param horasSemanales
	 * @param sala
	 * @param profesorAsignado
	 */
	public Curso(String nombre, int horasSemanales, Sala sala, Profesor profesorAsignado) {
		// TODO - implement Curso.Curso
		throw new UnsupportedOperationException();
	}

	public java.util.ArrayList<Estudiante> getEstudiantesInscritos() {
		return this.estudiantesInscritos;
	}

}