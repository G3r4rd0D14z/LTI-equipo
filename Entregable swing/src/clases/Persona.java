package clases;


import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {

	int idPersona;
	public String nombre, apellido, departamento;
	private int numHijos;
	private final LocalDate fechaNac;
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
	
	public Persona(String nombre, String apellido,int idPersona, String departamento, double numHijos,
			LocalDate fechaNac) {
		
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.numHijos = (int)numHijos;
		this.fechaNac = fechaNac;
	}
	


	
	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public String toString() {
		
		String salida = "Nombre: "+nombre+". Apellido: "+apellido+". Documento: "+idPersona+". \nFecha de nacimiento: "
				        +fechaNac+". Departamento: "+departamento+". Número de hijos: "+numHijos+".\n";
		return salida;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	
}
