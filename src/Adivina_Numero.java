import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);
		Scanner entrada = new Scanner (System.in);
		int numero = 0;
		int intentos = 0;
		System.out.print("Adivine el numero que tengo grabado en memoria.\n");
		while(numero!=aleatorio) {
			intentos ++;
			//System.out.println("Intento "+intentos +":");
			System.out.print("Ingrese el numero: ");
			numero=entrada.nextInt();
			if (aleatorio<numero){
				System.out.println("El numero es menor, intenta de nuevo.");
			}
			else if (aleatorio>numero) {
				System.out.println("El numero es mayor, intenta de nuevo");
			}
			
		}
		System.out.println("Correcto!  Lo lograste en "+intentos+" intento(s)");

	}

}
