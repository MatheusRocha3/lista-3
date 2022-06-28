package lista3b3;
import java.util.Scanner;

public class MenorEMaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número:");
            int respostaUsuario = input.nextInt();
                numeros[i] = respostaUsuario;
        }
        input.close();
        for (int i1 = 0; i1 < numeros.length - 1; i1++) {
            if (numeros[i1] > numeros[i1 + 1]) {
                int numeromenor = numeros[i1 + 1];
                int numeromaior = numeros[i1];
                numeros[i1] = numeromenor;
                numeros[i1 + 1] = numeromaior;
            }
            if (i1 > 0) {
                for (int i2 = 0; i2 < i1; i2++) {
                    if (numeros[i2] > numeros[i2 + 1]) {
                        int numeromenor = numeros[i2 + 1];
                        int numeromaior = numeros[i2];
                        numeros[i2] = numeromenor;
                        numeros[i2 + 1] = numeromaior;
                        System.out.println("O menor número é: " + numeros[0]);
                        System.out.println("O maior número é: " + numeros[numeros.length - 1]);
                    }
                }
            }
        }
    }
}
