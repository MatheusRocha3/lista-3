package lista3b4;
import java.util.Scanner;
public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos números deseja somar: ");
        int quantidadeNumeros = input.nextInt();
        int soma = 0;
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.println("Digite o " + i + " número:");
            int numero = input.nextInt();
            soma += numero;
            System.out.println("A soma dos números informados é: " + soma);
        }
        input.close();
    }
}

