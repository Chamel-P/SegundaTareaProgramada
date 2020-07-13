package productos2;

public class Nodo {
	private Nodo Siguiente;
	private Producto2 dato;

	public Nodo(Producto2 dato, Nodo siguiente) {
		this.Siguiente = siguiente;
		this.dato=dato;
	}

	public Nodo getSiguiente() {
		return Siguiente;
	}

	public Producto2 getDato() {
		return dato;
	}

	public void setSiguiente(Nodo siguiente) {
		Siguiente = siguiente;
	}

	public void setDato(Producto2 dato) {
		this.dato = dato;
	}
	

}
