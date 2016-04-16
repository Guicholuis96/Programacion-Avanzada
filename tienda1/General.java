package tienda1;
import java.util.Scanner;  //Importando funcion para escanear 

public class General {

	public static void main(String[] args) {
	
		System.out.println("********** Bienvenido a la tienda**********\n\n\n"); 
		 
		lista compra=new lista(); //Imprimiendo lista de objetos
		compra.imprimir_lista(); 

		
		int i=0;
		while(i<5){ //Ciclo para que el usuario ingrese lo que quiere comprar
			System.out.println("\nElige una cosa:\n");
			//String seleccion;
			String seleccion;
			Scanner entradaEscaner = new Scanner (System.in);
			seleccion = entradaEscaner.nextLine ();
			i++;
			String seleccion1;
			Scanner entradaEscaner1 = new Scanner (System.in);
			seleccion1 = entradaEscaner1.nextLine ();
			i++;
			String seleccion2;
			Scanner entradaEscaner2 = new Scanner (System.in);
			seleccion2 = entradaEscaner2.nextLine ();
			i++;
			String seleccion3;
			Scanner entradaEscaner3 = new Scanner (System.in);
			seleccion3 = entradaEscaner3.nextLine ();
			i++;
			
			String seleccion4;
			Scanner entradaEscaner4 = new Scanner (System.in);
			seleccion4 = entradaEscaner4.nextLine ();
		
			System.out.println("Estas seguro que deseas comprar esto (Si/No):\n");   //Confirmacion de compra
			String seleccion5;
			Scanner entradaEscaner5 = new Scanner (System.in);
			seleccion5 = entradaEscaner5.nextLine ();
			
			if(seleccion5.equals("Si")){
				System.out.println("\n\nTu compra es: \n\n"+seleccion+"\n"+seleccion1+"\n"+seleccion2+"\n"+seleccion3+"\n"+seleccion4+"\n");  //Imprimiendo lo que eligio el usuario
			}
			else {
				
				System.out.println("Compra cancelada");
			}
			i++;
		}
		//Constructores
		
		leche lala=new leche();
		lala.nombre="Lala";
		lala.precio=15;
		lala.cantidad=1;
		
		agua epura=new agua();
		epura.nombre="e pura";
		epura.precio=10;
		epura.cantidad=2;
		
		papasfritas sabritas=new papasfritas();
		sabritas.nombre="Sabritas";
		sabritas.precio=9;
		sabritas.cantidad=1;
		
		chicle trident=new chicle();
		trident.nombre="Trident";
		trident.precio=6;
		trident.cantidad=2;
		
		paleta rockaleta=new paleta();
		rockaleta.nombre="rockaleta";
		rockaleta.precio=4;
		rockaleta.cantidad=1;		

	}

}
