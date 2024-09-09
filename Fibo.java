package DesafioTarget;
import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Coloque o numero:");
		
		int num = scanner.nextInt();
		
		int a = 0;
		int b = 1;
		
		while (b < num) {
			int temp = a;
			
			a = b;
			
			b = temp+b;
		}
		
		if (b == num) 
			System.out.println("É fibo!!");
		else
			System.out.println("Não é fibo!!");
	}

}
