package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.RepostajeNormal;
import aplicacion.servicios.ImplPrincipal;
import aplicacion.servicios.ImplRepostaje;
import aplicacion.servicios.InterfazPrincipal;
import aplicacion.servicios.InterfazRepostaje;

/**
 * Clase principal
 * @author frand
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		// Lista de tipo RepostajeNormal (base de datos).
		List<RepostajeNormal> listaBD = new ArrayList<>();
		
		// Inicializamos la interfaz de Repostaje y Principal
		InterfazPrincipal intP = new ImplPrincipal();
		InterfazRepostaje intR = new ImplRepostaje();
		
		int opcion=-1;
		do {
			try {
				opcion = intP.Menu();
			} catch (Exception e) {
				// 
			}
			
			switch (opcion) {
			case 1:
				// Crear Repostaje normal
				try {
					listaBD = intR.creaRepostajeNormal(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido crear el repostaje normal **");
				}
				break;
			case 2:
				// Crear Repostaje factura
				try {
					listaBD = intR.creaRepostajeFactura(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido crear el repostaje factura **");
				}
				break;
			case 3:
				// Ver todos los repostajes
				try {
					intR.mostrarTodosRepostajes(listaBD);
				} catch (Exception e) {
					System.err.println("** Error: No se ha podido mostrar todos los repostajes **");
				}
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.err.println("** Error: El valor introducido no tiene el formato correcto **");
				break;
			}
		} while (opcion != 0);
		
	}

}
