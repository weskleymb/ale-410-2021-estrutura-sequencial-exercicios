import java.util.Scanner;

public class Questao10 {

    /*
    Faça um Programa que peça a temperatura em graus Celsius,
    transforme e mostre em graus Fahrenheit.
    dica: F = C * 1,8 + 32.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        Double celsius = entrada.nextDouble();

        Double fahrenheit = celsius * 1.8 + 32;

        System.out.println("A temperatura em graus Fahrenheit é " + fahrenheit + "°F");

    }

}
