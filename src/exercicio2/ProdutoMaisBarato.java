package exercicio2;


import java.util.*;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        double[] valor = new double[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Bem vindo ao nosso sistema de ajuda com preços \n");
        System.out.println("Digite o valor do primeiro produto: ");
        valor[0] = input.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        valor[1] = input.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        valor[2] = input.nextDouble();
        input.close();

        if (valor[0] < valor[1] && valor[0] < valor[2]) {
            System.out.print("Você deve comprar o primeiro produto!");
        } else if (valor[1] < valor[0] && valor[1] < valor[2]) {
            System.out.println("Você deve comprar o segundo produto!");
        } else {
            System.out.println("Você deve comprar o teceiro produto!");
        }
    }
}
