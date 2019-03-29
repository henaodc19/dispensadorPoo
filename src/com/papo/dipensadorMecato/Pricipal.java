package com.papo.dipensadorMecato;
import javax.swing.JOptionPane;

public class Pricipal {


	public static void main(String[] args) {
		
			while(true){
				
				String[] opciones = {"Ingresar producto", "Ver productos", "Sacar producto", "Opcion D"};
				int seleccion = JOptionPane.showOptionDialog(null, "Que deseas hacer", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				
				if(seleccion == 0){
					String nroSerial = JOptionPane.showInputDialog("Escribe el serial del producto");
					String nomProducto = JOptionPane.showInputDialog("Escribe el nombre del producto");
					String precioProducto = JOptionPane.showInputDialog("Escribe el precio del producto");
					String cantidadProducto = JOptionPane.showInputDialog("Escribe la cantidad del producto");
					int cantidadP = Integer.parseInt(cantidadProducto);
					double precioP = Integer.parseInt(precioProducto);
					int serial = Integer.parseInt(nroSerial);
					
					if(Dispensador.contador > 0){
						for (Productos verifCantidad : Dispensador.product) {
							if(serial == verifCantidad.getSerial()){
								if(serial + verifCantidad.getSerial() <= 12){
									verifCantidad.setCantidad(verifCantidad.getCantidad() + cantidadP);
								}
								else{
									System.out.println("No se permiten mas productos con este serial");
								}
								
							}
							else{
								Dispensador.ingresarProducto(serial, nomProducto, precioP, cantidadP);
							}
						}
					}
					else{
						Dispensador.ingresarProducto(serial, nomProducto, precioP, cantidadP);
					}
					
				}
				else if(seleccion == 1){
					for (Productos productos: Dispensador.product) {
						System.out.println("Nombre producto: " + productos.getNombre() + " Precio: " + productos.getPrecio() 
						 + " serial " + productos.getSerial() + " cantidad: " + productos.getCantidad());
					}
				}
				
				else if(seleccion == 2){
					
					String a = JOptionPane.showInputDialog("Escribe la cantidad del producto");
					int serial = Integer.parseInt(a);
					if(Dispensador.borrarProducto(serial)){
						System.out.println("Se elimino el producto satisfactoriamente");
					}
					else{
						System.out.println("No se encontro el producto a eliminar");
					}
					
				}
				
				else if(seleccion == 3){
					break;
				}
				
			}
			


	}

}
