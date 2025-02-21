import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int X, Y;
		int resultado;
		
		System.out.println("digite o valor de X: ");
		X=sc.nextInt();
		
		System.out.println("digite o valor de Y: ");
		Y=sc.nextInt();
		
		resultado = X + Y;
		
		System.out.println("A soma de X + Y eh: " + resultado);
		
		sc.close();
	}

}
