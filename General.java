
 import java.io.File;  //Importando para manejar archivos
 import java.io.FileNotFoundException; 
 import java.util.Scanner; //Importanto funcion para escanear

 public class General { //Funcion General

 public static void main(String[] args) throws FileNotFoundException { 
 File file = new File("src/CPdescarga.txt"); //Leyendo archivo
 
 Scanner Seleccion;    
 Seleccion = new Scanner(System.in); 
 String buscarCP; 
 System.out.println("\n\tIngrese el codigo postal que quiere buscar\n\n");  //Pidiendo el codigo postal a buscar
 
 buscarCP = Seleccion.nextLine(); //Guardando lo que se introduce
 Seleccion = new Scanner(file); 
 
 
 while (Seleccion.hasNextLine()) {  //Ciclo para recorrer el archivo
 String dato = Seleccion.nextLine(); 
 if (dato.startsWith(buscarCP)) { //Si el codigo que introdujo es igual a uno del archivo lo imprime
 System.out.println("\n\nLa direccion es:\n\n" + dato); //Imprimiendo 
 	
 			} 
 		} 

 	} 
 } 
