import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	int n1, n2, n3, opcao;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Selecione uma operacao");
	System.out.println("1 - Soma");
	System.out.println("2 - Subtracao");
	System.out.println("3 - Divisao");
	System.out.println("4 - multiplicacao");
	
	
	opcao = entrada.nextInt();
	
		if (opcao == 1) {
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		n1 = valor.nextInt();
		
		System.out.println("Digite o segundo valor");
		n2 = valor.nextInt();
		
		System.out.println("A soma e:" + Integer.sum(n1, n2));
		} 
		
		else if (opcao == 2) {
			
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		n1 = valor.nextInt();
			
		System.out.println("Digite o segundo valor");
		n2 = valor.nextInt();	
		
		n3 = n1 - n2;
		
		System.out.println("A subtracao e:" + n3);
		} 
		
		else if (opcao == 3) {
			
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		n1 = valor.nextInt();
				
		System.out.println("Digite o segundo valor");
		n2 = valor.nextInt();	
		
		n3 = n1/n2;
		
		System.out.println("A divisao e:" + n3);
		} 
		
		else if (opcao == 4){
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		n1 = valor.nextInt();
					
		System.out.println("Digite o segundo valor");
		n2 = valor.nextInt();
		
		n3 = n1 * n2;
		
		System.out.println("A multiplicacao e:" + n3);
		} 
		
		else {
			
		System.out.println("Opcao invalida.");
			
		}
	
	}
}
