import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente !");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}