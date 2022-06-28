package lista3b9;
import java.util.Scanner;

public class ValorFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int respostaUsuario;
        int fatorial = 1;
        System.out.println("Informe um número para se calcular o fatorial: ");
         respostaUsuario = input.nextInt();
        if (respostaUsuario >= 0) {
            for (int i = 1; i <= respostaUsuario; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("Fatorial é: " + fatorial);
        } else {
            System.out.println("Informe números a partir de 0! ");
        }
    }
}



