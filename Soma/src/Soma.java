import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		int n1, n2;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o primeiro numero");
	n1 = entrada.nextInt();
	
	System.out.println("Digite o segundo numero");
	n2 = entrada.nextInt();
	
	System.out.println("A soma eh:" + Integer.sum(n1, n2));
		
		
	}
}
