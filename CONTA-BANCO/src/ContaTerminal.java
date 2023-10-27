import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.print("Programa: Por favor, digite o número da Agência ! ");
        String agencia = scanner.nextLine();

        System.out.print("Programa: Por favor, digite o número da Conta ! ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número da conta

        System.out.print("Programa: Por favor, digite o nome do Cliente ! ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Programa: Por favor, digite o saldo da conta ! ");
        double saldo = scanner.nextDouble();

        // Exibir informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
