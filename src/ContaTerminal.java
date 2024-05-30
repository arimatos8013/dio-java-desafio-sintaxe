import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


       
        System.out.println("Por favor, informe sua agência: ");
        int numero = lerInteiro();

        System.out.println("Informe sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo: ");
        double saldo = lerNumerico();

        System.out.printf("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia +", conta " +numero + " e seu saldo " +saldo+ " já está disponível para saque!"); 

        scanner.close();
    }


    private static int lerInteiro() {
        String digitado = "";
    
        digitado = scanner.nextLine();
    
        return Integer.parseInt(digitado);
      }
    
      private static double lerNumerico() {
        String digitado = "";
    
        digitado = scanner.nextLine();
    
        return Double.parseDouble(digitado);
      }
}
