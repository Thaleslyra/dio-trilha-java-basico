import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("*** Por favor, preencha os dados do cliente: *** ");
        System.out.println();

        System.out.println("Digite o Número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o Número do Cliente: ");
        int numeroCliente = scanner.nextInt();

        /*
         Tive que chamar novo scanner para limpar o anterior
         pois o mesmo não chamava as a entrada de dados do usuário.
         */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("digite o Saldo do Cliente: ");
        double saldo = sc.nextDouble();

        System.out.println( "Agência - "+ agencia);
        System.out.println( "Número Cliente - " + numeroCliente);
        System.out.println( "Nome do Cliente - " + nomeCliente);
        System.out.println( "Saldo do Cliente - R$ " + saldo );
    }
}