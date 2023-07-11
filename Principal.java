package parcial1;
import java.util.Scanner;
public class Principal {

	private static String eleccion="";
	private static void mostrarMenu(){
		System.out.println("Menu: ");
		System.out.println("1: Registrar Cliente");
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Opción: ");
		eleccion = scanner.nextLine();

	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		while (!eleccion.equals("q")){
			mostrarMenu();	
			switch(eleccion) {
			case "1":
				
			}
	}
	}
}
