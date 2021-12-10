import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        // cria o leitor de dados
        Scanner entrada = new Scanner(System.in);

        // imprime a solicitação do numero
        System.out.println("Informe o numero");

        // cria a variavel numero e armazena o numero digitado
        Integer numero = entrada.nextInt();

        // imprime o resultado final
        System.out.println("O número informado é " + numero);

    }

}
