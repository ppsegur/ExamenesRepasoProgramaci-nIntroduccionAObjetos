package ejercicio1;

public class Corredor {
/*nombre, apellidos, dorsal (número de
corredor), categoría (un entero para tres posibilidades que son juvenil, senior o veterano) y el tiempo que ha tardado en acabar la carrera
medido en minutos (para no complicar los cálculos tendrá decimales pero no hace falta pasarlo a segundos ni nada de eso, un número
de minutos con decimales, por ejemplo, el tiempo de un corredor puede ser 20.8 minutos).*/
	/**
	 * Atributos de corredor
	 * @author segura.rojos23
	 */
	private String nombre;
	private String apellidos;
	private int dorsal;
	private int categoria;
	private double tiempo;
	
	/**
	 * Constructor de la clase corredor 
	 * @param nombre
	 * @param apellidos
	 * @param dorsal
	 * @param categoria
	 * @param tiempo
	 */
	public Corredor(String nombre, String apellidos, int dorsal, int categoria, double tiempo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.categoria = categoria;
		this.tiempo = tiempo;
	
	}
	//constructor vacio
	public Corredor() {
		
	}
	
	
	
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	
	//To String 
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal + ", categoria="
				+ categoria + ", tiempo=" + tiempo +  "]";
	}
	
}
