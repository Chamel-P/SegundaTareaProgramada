package producto.ListaYNodo;

import producto.Producto;

public class Nodo {
	
	public Nodo next;
	public Producto value;
	

	public Nodo(Producto producto) {
		this.value = producto;
	}
}
