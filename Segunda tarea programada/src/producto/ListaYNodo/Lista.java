package producto.ListaYNodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import producto.Producto;

public class Lista extends Producto {

	public void CargarDatos() {
		Scanner filereader;
		
		if (super.B == false) {
			try {
				filereader = new Scanner(new File(
						"C:\\Users\\Steve Alejandro\\eclipse-workspace\\Segunda tarea programada\\src\\dataset-limpio.csv"));
				while (filereader.hasNext()) {	
					String[] separador = filereader.nextLine().split(",");
					
					agregar(new Nodo(new Producto(separador[0], separador[3], separador[4])));
				}
				filereader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Datos exitosamente cargados :) \n");
			super.B = true;

		} else {
			System.out.println("Ya se cargaron los datos\n");
		}

	}

	public void agregar(Nodo nuevoNodo) {
		if (estaVacia()) {
			super.inicio = nuevoNodo;
		} else {
			Nodo temp = super.inicio;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nuevoNodo;
		}
	}

	public void busqueporChart() {
		int contador = 0;
		boolean B = false;
		if (estaVacia()) {
			System.out.println("No a cargado los datos\n");
		} else {
			System.out.println("Ingrese Datos a buscar");
			String string = super.input.nextLine();
			System.out.println("Buscando.......\n");
			Nodo temp = inicio;
			while (temp != null) {
				if (temp.value.getNombre().toLowerCase().contains(string.toLowerCase())) {
					System.out.println(temp.value.getNombre() + " Su posicion en la lista es " + contador);
					temp = temp.next;
					B = true;
				} else {
					temp = temp.next;
				}
				contador++;
			}
			if (B == false) {
				System.out.println("No se encontro similitudes en su busqueda, intente nuevamente\n");
			}
			System.out.println("-------------------------------------------------------------------------");
		}
	}

	public void ultimos3Codigo() {
		if (estaVacia()) {
			System.out.println("No a cargado los datos\n");
		} else {
			System.out.println("");
			Nodo temp = inicio;
			while (temp != null ) {
				System.out.println("Nombre: " + temp.value.getNombre() + " , Las ultimas letras de su codigo es: "
						+ temp.value.getCodigo().substring(temp.value.getCodigo().length() - 3,
								temp.value.getCodigo().length()));
				
				temp = temp.next;
			}
			System.out.println(
					"////////////////////////////////////////////////////////////////////////////////////////////////////");
		}

	}

	private boolean estaVacia() {
		return inicio == null ? true : false;
	}

}
