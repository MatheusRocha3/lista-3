package exercicio5;
import java.util.Scanner;

public class DiaDaSemana {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int dia;
        System.out.println("Digite um número de 1 até 7 para descobrir o dia da semana");
        dia = input.nextInt();
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else if (dia > 7) {
            System.out.println("Número inválido.");
        }
    }
}


