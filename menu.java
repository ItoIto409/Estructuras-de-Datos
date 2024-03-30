/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProyectoEstructuras;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Crear tarjeta");
            System.out.println("2. Ver tarjetas");
            System.out.println("3. Ver tarjetas guardadas");
            System.out.println("4. Salir");
            System.out.print("Ingrese el numero de la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:                    
                    System.out.println("Ingrese el titulo del consejo");
                    String tarjetaTitle = scanner.nextLine();		    
            	    
                    System.out.println("Ingrese el consejo");
                    String tarjetaData = scanner.nextLine();	    
                    
                    System.out.println("Ingrese la etiqueta del consejo");
                    String tarjetaTag = scanner.nextLine();	
                    
                    Tarjeta tarjeta = new Tarjeta(tarjetaData, tarjetaTitle, tarjetaTag, null);
                    lista.add(tarjeta); 
                    
                    System.out.println("Ingrese '1' para seguir ingreasando ó ingrese '0' para dejar de ver ingresar");
                    insertContinue = scanner.nextInt();
                    
                    scanner.nextLine(); // Esta aqui para que no se vuelva a llamar a scanner.nextInt() en vez de a scanner.nextLine() en el siguiente ciclo.
                    
                    break;
                case 2:
                    //declaracion del iterator 
                	Lista<Tarjeta>.ListaIterator iterador = lista.new ListaIterator();
                
                	//sub-menu
                	int tarjetaContinue = 1;
                	
                	while(iterador.hasNext() && tarjetaContinue == 1){
                	    Tarjeta actualTarjeta = iterador.next();
                
                	    System.out.println(actualTarjeta.getTitle());                	    
                	    System.out.println(actualTarjeta.getData());                	    
                	    System.out.println(actualTarjeta.getTag());
                	    
                	    if(iterador.hasNext()){
                	        System.out.println("Ingrese '1' para ver la siguiente tarjeta ó ingrese '0' para dejar de ver tarjetas");
                	        tarjetaContinue = scanner.nextInt();
                	    }
                	    else{
                	        System.out.println("No hay mas cartas para mostrar");
                	    }
                	}

                    
                    
                    
                    break;
                case 3:
                    System.out.println("Tarjetas guardadas:");
                    // Aquí podrías implementar la lógica para mostrar las tarjetas guardadas
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, ingrese un numero valido.");
            }

        } while (opcion != 4);
    }
}    

