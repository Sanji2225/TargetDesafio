package DesafioTarget;
import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		java.lang.String texto = scanner.nextLine();
		
		int counter = 0;
		boolean tem_A = false;
		
		for (int i = 0; i<texto.length();i++) {
			char letra = texto.charAt(i);
			if(letra == 'a' || letra =='A') {
				counter++;
				tem_A = true;
			}
		}
		if(tem_A==true) 
			System.out.print("Tem A, " + counter + " vezes!!");
		else
			System.out.print("Não tem A!!");
	}

}
