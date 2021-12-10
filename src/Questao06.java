import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        /*
        Faça um Programa que peça o raio de um círculo,
        calcule e mostre sua área.
         */

        final Double PI = 3.141516;

        Scanner entrada = new Scanner(System.in);

        // solicita e armazena o valor do raio
        System.out.println("Digite o valor do raio:");
        Double raio = entrada.nextDouble();

        // area = PI * raio ao quadrado
        Double area = PI * raio * raio;

        // imprimir o resultado da area
        System.out.println("A área do círculo é " + area);

    }

}
