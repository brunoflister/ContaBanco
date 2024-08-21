import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    public static void main(String[] args) throws Exception{
        //Declarando um scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Nome Completo");
        nomeCliente = scanner.nextLine();

        //Tomando entrada do usuário
        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo");
        saldo = scanner.nextDouble();

        //Imprimindo dados de saida
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+saldo+" já está disponível para saque");

        scanner.close();
    }
    
}
