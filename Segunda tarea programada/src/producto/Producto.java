package producto;

import java.util.Scanner;

import producto.ListaYNodo.Nodo;

public class Producto {
	private String codigo;
	private String nombre;
	private String categoria;
	protected Nodo inicio=null;
	protected Scanner input = new Scanner(System.in);
	protected boolean B = false;
	protected Nodo[] ListaN = new Nodo[4096];
	protected int posicion;

	public Producto(String codigo, String nombre, String categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public Producto(Nodo incio) {
		super();
		this.inicio = incio;
	}

	public Producto() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}

	
}
