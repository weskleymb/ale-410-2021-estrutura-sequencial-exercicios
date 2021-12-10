import java.util.Scanner;

public class Questao09 {

    /*
    Faça um Programa que peça a temperatura em graus Fahrenheit,
    transforme e mostre a temperatura em graus Celsius.
    dica: C = 5 * ((F-32) / 9).
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit:");
        Double fahrenheit = entrada.nextDouble();

        Double celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.println("A temperatura em graus é Celsius " + celsius + "°C");

    }

}
