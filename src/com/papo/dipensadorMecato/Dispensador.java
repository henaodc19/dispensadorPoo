package com.papo.dipensadorMecato;
import java.util.ArrayList;
import java.util.Arrays;

public class Dispensador {
	
	static int contador;
	Productos producto;
	
	static ArrayList<Productos> product = new ArrayList<>(Arrays.asList());
	
	public  static void ingresarProducto(int serial, String nombre, double precio, int cantidad){
		Productos nuevo = new Productos(serial, nombre, precio, cantidad);
		product.add(nuevo);
		contador++;
		
	}
	
	public static boolean borrarProducto(int codigoSerial){
		boolean condicion = false;
		for(int i = 0; i <= product.size(); i++) {
			if(product.get(i).getSerial() == codigoSerial){
				product.remove(i);
				condicion = true;
				break;
			}
		}
		return condicion;
		
	}
	
	public static boolean sacarProducto(int serial, int cantidad){
		boolean verificacion = false;
		for (Productos productosASacar : product) {
			if(serial == productosASacar.getSerial() && productosASacar.getCantidad() - cantidad >= 0){
				productosASacar.setCantidad(productosASacar.getCantidad() - cantidad);
				verificacion = true;
			}
		}
		return verificacion;
	}
	
	public static boolean ingresarUnidadProducto(int serial, int cantidad){
		boolean verificacion = false;
		for (Productos productosAIngresar : product) {
			if(serial == productosAIngresar.getSerial() && cantidad + productosAIngresar.getCantidad() <= 12){
				productosAIngresar.setCantidad(productosAIngresar.getCantidad() + cantidad);
				verificacion = true;
			}
		}
		return verificacion;
	}
	public Productos getProducto() {
		return producto;
	}
	
	
}
