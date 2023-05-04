package aplicacion.entidades;

import java.time.LocalDate;

public class RepostajeFactura extends RepostajeNormal {
	
	// Atributos
	
	private String dniCliente, matriculaVehiculo;
	
	// Constructores
	
	// Constructor 1 -> Constructor con todos los parametros
	public RepostajeFactura(LocalDate fecha, float litros, float importe, String dniCliente, String matriculaVehiculo) {
		super(fecha, litros, importe);
		this.dniCliente = dniCliente;
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	// Getter y Setter
	
	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}

	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	// Métodos
	
	@Override
	public String toString() {
		return "[fecha=" + getFecha() + ", litros=" + getLitros() + ", importe=" + getImporte() + ", dniCliente=" + dniCliente + ", matriculaVehiculo=" + matriculaVehiculo + "]";
	}
}
