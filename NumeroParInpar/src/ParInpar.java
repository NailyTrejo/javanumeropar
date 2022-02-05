import java.util.Scanner; //ingresar los datos 
/*public class ParInpar {
	public static boolean esPar(int numero) {
		return numero %2 == 0;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in); 
		int numero;
		System.out.println("Introduce un numero entero:");
		numero =sc.nextInt();
		if(esPar(numero)) {
			System.out.println("Si es par:" +  numero);
	
		} else {
			System.out.println("Es impar:" + numero);
		}
	}
}*/


public class ParInpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		String resultado;
			System.out.println("Introduce un numero entrero:");
			numero = entrada.nextInt();
			resultado =(numero % 2 ==0)? "par": "impar";
			System.out.printf("El número %d es %s/n", numero, resultado);
		}
	}
