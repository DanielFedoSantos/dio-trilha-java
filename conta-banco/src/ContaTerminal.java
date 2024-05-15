import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da conta!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o numero da agencia!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do titular!");
        String nome = scanner.next();
        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, agencia é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

    }
}
