package lista3b6;
import java.util.Scanner;
public class SomaNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor inicial do intervalo: ");
        int valorInicialIntervalo = input.nextInt();
        System.out.println("Informe o valor final do intervalo: ");
        int valorFinalIntervalo = input.nextInt();
        input.close();

        if (valorInicialIntervalo > valorFinalIntervalo) {
            System.out.println("Intervalo de valores inválido.");
        } else {
            int soma = 0;
            for (int i = valorInicialIntervalo; i <= valorFinalIntervalo; i ++) {
                if (i % 2 > 0) {
                    soma += i;
                }
            }
            System.out.println("A soma dos números ímpares " + valorInicialIntervalo + " e " + valorFinalIntervalo + " é: " + soma);
        }
    }
}

