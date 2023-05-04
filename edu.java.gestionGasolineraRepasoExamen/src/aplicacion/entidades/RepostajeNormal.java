package aplicacion.entidades;

import java.time.LocalDate;

public class RepostajeNormal {
	
	// Atributos
	
	private LocalDate fecha;
	private float litros, importe;

	// Constructores
	
	// Constructor 1 -> Con todos los atributos
	public RepostajeNormal(LocalDate fecha, float litros, float importe) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
	}
	
	// Getter y Setter
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	// Métodos
	
	@Override
	public String toString() {
		return "[fecha=" + fecha + ", litros=" + litros + ", importe=" + importe + "]";
	}
}
