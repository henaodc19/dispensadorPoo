package com.papo.dipensadorMecato;
import javax.swing.JOptionPane;

public class Pricipal {


	public static void main(String[] args) {
		
			while(true){
				
				String[] opciones = {"Ingresar nuevo producto", "Ver productos", "Sacar producto", "Adicionar producto", "Eliminar producto", "Cancelar"};
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
						if(Dispensador.product.size() < 10){
							Dispensador.ingresarProducto(serial, nomProducto, precioP, cantidadP);
						}
						else{
							System.out.println("Se ha llegado al limite de productos");
						}
					}
					else{
						Dispensador.ingresarProducto(serial, nomProducto, precioP, cantidadP);
					}
					
				}
				else if(seleccion == 1){
					for (Productos productos: Dispensador.product) {
						System.out.println("Nombre producto: " + productos.getNombre() + " - Precio: " + productos.getPrecio() 
						 + "  - serial " + productos.getSerial() + "  - cantidad: " + productos.getCantidad());
					}
				}
				else if(seleccion == 2){
					String unidades = JOptionPane.showInputDialog("¿Cuantas unidades deseas sacar?");
					int UnidadesAsacar = Integer.parseInt(unidades);
					String serial = JOptionPane.showInputDialog("Escribe el serial del producto");
					int serialProducto = Integer.parseInt(serial);
					if(Dispensador.sacarProducto(serialProducto, UnidadesAsacar)){
						System.out.println("Unidades del productor retiradas satisfactoriamente");
					}
					else{
						System.out.println("La cantidad del producto es mayor a las existentes o su serial es incorrecto, por favor verificar");
					}
					
				}
				else if(seleccion == 3){
					String unidades = JOptionPane.showInputDialog("¿Cuantas unidades deseas ingresar?");
					int unidadesAIngresar = Integer.parseInt(unidades);
					String serial = JOptionPane.showInputDialog("Escribe el serial del producto");
					int serialProducto = Integer.parseInt(serial);
					if(Dispensador.ingresarUnidadProducto(serialProducto, unidadesAIngresar)){
						System.out.println("Unidades del producto ingresadas satisfactoriamente");
					}
					else{
						System.out.println("La cantidad del producto supera el limite especificado o su serial es incorrecto, por favor verificar");
					}
					
				}
				
				else if(seleccion == 4){
					
					String a = JOptionPane.showInputDialog("Escribe el serial del producto a eliminar");
					int serialAEliminar = Integer.parseInt(a);
					if(Dispensador.borrarProducto(serialAEliminar)){
						System.out.println("Se elimino el producto satisfactoriamente");
					}
					else{
						System.out.println("No se encontro el producto a eliminar");
					}
					
				}
				
				else if(seleccion == 5){
					break;
				}
				
			}
			


	}

}
