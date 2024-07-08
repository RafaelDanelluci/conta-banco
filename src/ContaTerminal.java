import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Nome do Cliente: ");
        String nomeCliente = myObj.nextLine();

        System.out.println("Numero da Agencia: ");
        String agencia = myObj.nextLine();

        System.out.println("Numero da Conta: ");
        int numeroConta = myObj.nextInt();

        System.out.println("Saldo da Conta: ");
        float saldoConta = myObj.nextFloat();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

    }
}
