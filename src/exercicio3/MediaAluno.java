package exercicio3;

import java.util.Scanner;

public class MediaAluno {


    public static void main(String[] args) {
        System.out.print("Bem vindo(a)!Iremos te ajudar a descobrir se passou ou não de ano! \n");
        int[] nota = new int[2];
        int media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota[0] = input.nextInt();
        System.out.println("Digite a nota 2: ");
        nota[1] = input.nextInt();
        input.close();

        media = (nota[0] + nota[1]) / 2;

        if (media >= 7 && media == 9) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (media < 7) {
            System.out.println("Você foi reprovado!");
        } else
            System.out.println("Parabéns! Você foi aprovado com distinção!");
    }
}