package aplicacion.servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz principal
 * @author frand
 *
 */
public class ImplPrincipal implements InterfazPrincipal {

	@Override
	public int Menu() {
		// Variables necesarias
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		// Mostramos el menu
		do {
			System.out.println("1. Crea repostaje normal");
			System.out.println("2. Crea repostaje factura");
			System.out.println("3. Ver todos los repostajes");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			
			if(opcion < 0 || opcion > 3)
				System.err.println("** ERROR: La opcion no esta dentro del rango **");
		} while (opcion < 0 || opcion > 3);
		
		
		// Devolvemos la opcion
		return opcion;
	}

}
