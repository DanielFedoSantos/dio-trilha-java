import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm >= parametroDois)
            throw new ParametrosInvalidosException();
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
		//realizar o for para imprimir os números com base na variável contagem
	}
}