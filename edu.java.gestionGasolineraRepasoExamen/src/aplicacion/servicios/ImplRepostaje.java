package aplicacion.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.RepostajeFactura;
import aplicacion.entidades.RepostajeNormal;

/**
 * Implementacion de la interfaz repostaje
 * @author frand
 *
 */
public class ImplRepostaje implements InterfazRepostaje {

	@Override
	public List<RepostajeNormal> creaRepostajeNormal(List<RepostajeNormal> listaBD) {
		// Repostaje normal: fecha ,litros, importe.
		
		// Variables necesarias
		Scanner sc = new Scanner(System.in);
		LocalDate fecha;
		float litros, importe;
		
		// Pedimos la fecha del repostaje
		System.out.print("Introduzca la fecha del repostaje [0000-00-00]: ");
		fecha = LocalDate.parse(sc.next());
		
		// Pedimos el importe
		System.out.print("Introduzca el importe del repostaje: ");
		importe = sc.nextFloat();
		
		// Calculamos los litros
		litros = Math.round((importe / 1.447f) * 100f) / 100f;
		
		// Creamos el repostaje y lo añadimos a la lista
		RepostajeNormal r = new RepostajeNormal(fecha, litros, importe);
		listaBD.add(r);
		
		// Devolvemos la lista actualizada
		return listaBD;
	}

	@Override
	public List<RepostajeNormal> creaRepostajeFactura(List<RepostajeNormal> listaBD) {
		// Repostaje factura: fecha ,litros, importe, dni, matricula.
		
		// Variables necesarias
		Scanner sc = new Scanner(System.in);
		LocalDate fecha;
		float litros, importe;
		String dni, matricula;
		
		// Pedimos la fecha del repostaje
		System.out.print("Introduzca la fecha del repostaje [0000-00-00]: ");
		fecha = LocalDate.parse(sc.next());
		
		// Pedimos el importe
		System.out.print("Introduzca el importe del repostaje: ");
		importe = sc.nextFloat();
		
		// Calculamos los litros
		litros = Math.round((importe / 1.447f) * 100f) / 100f;
		
		// Pedimos el dni del cliente
		System.out.print("Introduzca el dni del cliente: ");
		dni = sc.next();
		
		// Pedimos la matricula del cliente
		System.out.print("Introduzca la matricula del vehiculo: ");
		matricula = sc.next();
		
		// Creamos el repostaje y lo añadimos a la lista
		RepostajeNormal r = new RepostajeFactura(fecha, litros, importe, dni, matricula);
		listaBD.add(r);
		
		// Devolvemos la lista actualizada
		return listaBD;
	}

	@Override
	public void mostrarTodosRepostajes(List<RepostajeNormal> listaBD) {
		for (RepostajeNormal aux : listaBD) {
			System.out.println(aux.toString());
		}
	}

}
