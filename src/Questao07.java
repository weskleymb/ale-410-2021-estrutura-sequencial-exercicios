import java.util.Scanner;

public class Questao07 {

    /*
    Faça um Programa que calcule a área de um quadrado,
    em seguida mostre o dobro desta área para o usuário.

    dica: area = lado * lado
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado:");
        Double lado = entrada.nextDouble();

        Double area = lado * lado;

        Double dobro = area * 2;

        System.out.println("O dobro da área de um quadrado de lado " + lado + " é " + dobro);

    }

}
