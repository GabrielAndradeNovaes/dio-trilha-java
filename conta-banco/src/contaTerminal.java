import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numeroConta
                + " e seu saldo " + saldo + " já está disponível para saque.");

        
        scanner.close();
    }
}
