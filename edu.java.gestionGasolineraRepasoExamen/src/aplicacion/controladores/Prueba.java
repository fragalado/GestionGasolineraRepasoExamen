package aplicacion.controladores;

import java.time.LocalDate;

import aplicacion.entidades.RepostajeFactura;
import aplicacion.entidades.RepostajeNormal;

public class Prueba {

	public static void main(String[] args) {
		RepostajeNormal r = new RepostajeNormal(LocalDate.parse("2023-02-01"), 10, 10);
		RepostajeNormal r1 = new RepostajeFactura(LocalDate.parse("2023-02-01"), 10, 10, "53965130", "Francisco GAllego");
		
		
		System.out.println(r.getClass());
		
		System.out.println(r1.getClass().getName().contains("RepostajeFactura"));

	}

}
