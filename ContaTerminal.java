import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo(a)! Vamos iniciar a criação de sua conta no banco! Primeiro, digite o seu nome:");
        var nome = scanner.nextLine();
        System.out.println("Agora, digite o número da conta:");
        var numero = scanner.nextInt();
        System.out.println("Em seguida, digite o número da agência:");
        var agenc = scanner.next();
        System.out.println("Por fim, insira o seu saldo atual:");
        var saldo = scanner.nextBigDecimal();
        System.out.printf("Olá %s, nós agradecemos por criar uma conta neste banco!, Sua agência é %s, conta número %s com saldo de %s disponível para saque!", nome, agenc, numero, saldo);

    }
}