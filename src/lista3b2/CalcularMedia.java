package lista3b2;
import java.util.Scanner;
public class CalcularMedia {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Informe com quantos números deseja fazer a média:");
            int quantidadenumeros = input.nextInt();
            double soma = 0;
            double media;
            int numeros = quantidadenumeros;
                for (int i = 1; i <= quantidadenumeros; i++) {
                    System.out.println("Digite o " + i + " número: ");
                    int numero = input.nextInt();
                        soma += numero;
                        media = soma / numeros;
                    System.out.println("A média dos números informados é: " + media);
                }
        input.close();
            }
        }
