package productos2;

public class Lista2_0 {
	private Nodo inicio;

	public Lista2_0() {
		this.inicio = null;
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public boolean estaVacia() {

		return inicio == null;
	}

	public Nodo agregar(Producto2 producto) {
		Nodo actual;
		if (estaVacia()) {
			actual = new Nodo(producto, null);
			inicio = actual;

		} else {

			actual = new Nodo(producto, null);
			Nodo temp = inicio;
			// inicio.setsiguietne
			while (temp.getSiguiente() != null) {
				temp = temp.getSiguiente();
			}

			temp.setSiguiente(actual);

		}

		return inicio;
	}


}
