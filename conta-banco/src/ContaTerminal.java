import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = 3401;
        String agencia = "601-2";
        double saldo = 100;

        System.out.println("Por favor, digite seu nome e sobrenome:");
        String nomeCliente = scanner.next();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
