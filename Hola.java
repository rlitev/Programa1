import java.util.Scanner;
public class Hola{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo:");
        
		String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el primer número entero:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero:");
        int numero2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número entero:");
        int numero3 = scanner.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
        System.out.println("Tercer número: " + numero3);
        
        scanner.close();
	}
}