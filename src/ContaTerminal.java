import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da agencia:");
		int numero = sc.nextInt();
		System.out.println("Digite o nome da agencia:");
		String agencia = sc.next();
		System.out.println("Digite o nome do cliente:");
		String Nome_cliente = sc.next();
		System.out.println("Digite o saldo:");
		float saldo = sc.nextFloat();
		
		System.out.println("Olá " + Nome_cliente + ","
				+ " obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + agencia + ", conta " + numero + " e"
				+ " seu saldo " + saldo +" já está disponível para saque");
		
	}

}
