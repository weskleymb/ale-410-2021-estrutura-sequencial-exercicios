import java.util.Scanner;

public class Questao08 {

    /*
    Faça um Programa que pergunte quanto você ganha por hora
    e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quanto vale sua hora trabalhada:");
        Double valorDaHoraTrabalhada = entrada.nextDouble();

        System.out.println("Informe o número de horas que você trabalhou:");
        Double quantidadeDeHorasTrabalhadas = entrada.nextDouble();

        Double totalDeSalario = valorDaHoraTrabalhada * quantidadeDeHorasTrabalhadas;

        System.out.println("O total de salário é " + totalDeSalario);

    }

}
