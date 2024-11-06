package cl.ufro.dci.Model;

public class Profesor {

	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;
	private Long contacto;
	private java.util.Arraylist<Curso> cursosAsignados;

	public java.util.Arraylist<Curso> getCursosAsignados() {
		return this.cursosAsignados;
	}

	/**
	 * 
	 * @param curso
	 */
	public void asignarCurso(Curso curso) {
		// TODO - implement Profesor.asignarCurso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 */
	public void desasignarCurso(Curso curso) {
		// TODO - implement Profesor.desasignarCurso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */
	public Profesor(String nombre, String apellido, String rut) {
		// TODO - implement Profesor.Profesor
		throw new UnsupportedOperationException();
	}

}