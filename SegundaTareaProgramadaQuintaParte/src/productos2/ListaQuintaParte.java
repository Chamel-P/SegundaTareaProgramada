package productos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListaQuintaParte {
	Scanner input = new Scanner(System.in);
	Nodo[] lista = new Nodo[4096];
	Lista2_0 L;

	public void CargarDatos2() {
		Scanner filereader;

		try {
			filereader = new Scanner(new File(
					"C:\\Users\\Steve Alejandro\\eclipse-workspace\\Segunda tarea programada\\src\\dataset-limpio.csv"));
			while (filereader.hasNext()) {
				String[] separador = filereader.nextLine().split(",");
				int posicion = Integer
						.parseInt(separador[0].substring(separador[0].length() - 3, separador[0].length()), 16);

				if (lista[posicion] != null) {
					L = new Lista2_0();
					L.setInicio(lista[posicion]);

					lista[posicion] = L.agregar(new Producto2(separador[0], separador[3], separador[4]));

				} else {
					L = new Lista2_0();
					lista[posicion] = L.agregar(new Producto2(separador[0], separador[3], separador[4]));
				}

			}

			filereader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void buscarUnaPosicion() {
		System.out.println("ingresa la posicion deseada");

		Nodo temp = lista[input.nextInt()];
		if (temp != null) {
			while (temp != null) {
				System.out.println(temp.getDato().toString());
				temp = temp.getSiguiente();
			}
		}else {
			System.out.println("En esta posicion no hay ningun elemento\n");
		}
	}

	public void VerSiHayDatos() {
		int contador = 0, posicion = 0;
		while (posicion < 4096) {
			Nodo temp = lista[posicion];
			while (temp != null) {
				contador++;
				temp = temp.getSiguiente();

			}
			if (contador == 0) {
				System.out.println("En la posicicon " + (posicion + 1) + " , No hay ningun elemento");
			} else {
				System.out.println("En la posicicon " + (posicion + 1) + " hay " + contador + " elementos");
			}
			posicion++;
			contador = 0;

		}

	}
}
