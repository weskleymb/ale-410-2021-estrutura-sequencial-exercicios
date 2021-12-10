import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        /*
        Faça um Programa que peça as
        04 notas bimestrais e mostre a média.
         */

        Scanner entrada = new Scanner(System.in);

        // instruções para a nota do 1º bimestre
        System.out.println("Digite a nota do 1º bimestre:");
        Double nota1 = entrada.nextDouble();

        // instruções para a nota do 2º bimestre
        System.out.println("Digite a nota do 2º bimestre:");
        Double nota2 = entrada.nextDouble();

        // instruções para a nota do 3º bimestre
        System.out.println("Digite a nota do 3º bimestre:");
        Double nota3 = entrada.nextDouble();

        // instruções para a nota do 4º bimestre
        System.out.println("Digite a nota do 4º bimestre:");
        Double nota4 = entrada.nextDouble();

        // calculo da media das 04 notas
        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // exibe o resultado da media
        System.out.println("A média final é " + media);

    }

}
