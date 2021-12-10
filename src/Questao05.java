import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        /*
        Faça um Programa que converta
        metros para centímetros.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a medida em metros (m):");
        Double metros = entrada.nextDouble();

        Double centimetros = metros * 100.0;

        System.out.println("A medida em centímetros é " + centimetros + " cm");

    }

}
