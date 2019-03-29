package com.papo.dipensadorMecato;

public class Productos {
	private String nombre;
	private double precio;
	private int cantidad;
	private int serial;
	
	public Productos(int serial, String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.serial = serial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int getSerial() {
		return serial;
	}
	
	
	
	
}
