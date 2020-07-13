package menu;

import java.util.Scanner;

import producto.ListaYNodo.Lista;

public class Menu1To4 {
	Scanner input = new Scanner(System.in);
	Lista L = new Lista();

	public void menu() {

		System.out.println(
				"SELECCCIONE UNA OPCION\n" 
		                + "1-)Cargar Datos\n" 
						+ "2=)Buscar datos por aproximacion del nombre\n"
						+ "3-)Genere la lista de todos los distintos valores del código alfanumérico existentes\n"
						+ "4-)Salir");

		switch (input.nextInt()) {
		case 1:
			L.CargarDatos();
			menu();
			break;

		case 2:
			L.busqueporChart();
			menu();
			break;

		case 3:
			L.ultimos3Codigo();
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
