import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Conta:");
        conta.numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        conta.agencia = input.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        conta.nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        conta.saldo = input.nextDouble();

        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo de [Saldo] já está disponível para saque".
        System.out.println("Olá " + conta.nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo "
                + conta.saldo + " já está disponível para saque");
    }
}