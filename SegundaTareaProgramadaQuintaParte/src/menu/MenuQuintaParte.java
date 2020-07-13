package menu;

import java.util.Scanner;
import productos2.ListaQuintaParte;

public class MenuQuintaParte {
	Scanner input = new Scanner(System.in);
	ListaQuintaParte L = new ListaQuintaParte();

	public void menu() {

		System.out.println("SELECCCIONE UNA OPCION\n" + "1-)Cargar Datos\n" + "2=)Buscar en una posicion especifica\n"
				+ "3-)Ver en que posicon hay datos\n" + "4-)Salir");

		switch (input.nextInt()) {
		case 1:
			L.CargarDatos2();
			menu();
			break;

		case 2:
L.buscarUnaPosicion();
			menu();
			break;

		case 3:
L.VerSiHayDatos();
			menu();
			break;

		case 4:
			System.out.println("HASTA LUEGO :)");
			break;

		default:
			System.out.println("Opciones incorrecta, eliga de nuevo");
			menu();
			break;
		}

	}
}
