package cl.ufro.dci.Model;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;
	private String contacto;
	private java.util.ArrayList<Curso> cursosInscritos;

	public java.util.ArrayList<Curso> getCursosInscritos() {
		return this.cursosInscritos;
	}

	/**
	 * 
	 * @param curso
	 */
	public void inscribirCurso(Curso curso) {
		// TODO - implement Estudiante.inscribirCurso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 */
	public void desinscribirCurso(Curso curso) {
		// TODO - implement Estudiante.desinscribirCurso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */
	public Estudiante(String nombre, String apellido, String rut) {
		// TODO - implement Estudiante.Estudiante
		throw new UnsupportedOperationException();
	}

}