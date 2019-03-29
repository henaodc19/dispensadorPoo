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
	public Productos getProducto() {
		return producto;
	}
	
	
}
