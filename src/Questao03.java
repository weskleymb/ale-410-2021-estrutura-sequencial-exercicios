import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        /*
        Faça um Programa que peça
        dois números e imprima a soma.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1:");
        Double numero1 = entrada.nextDouble();

        System.out.println("Digite o numero 2:");
        Double numero2 = entrada.nextDouble();

        Double soma = numero1 + numero2;

        System.out.println("A soma dos números é " + soma);

    }

}
