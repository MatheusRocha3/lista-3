package exercicio4;

import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {
        System.out.print("Bem vindo(a)!Aqui vamos te ajudar a descobrir seus valores referentes ao reajuste de salário \n");
        Scanner input = new Scanner(System.in);
        double valordoaumento;
        double novosalario;
        System.out.println("Digite o seu salário: ");
        double salario = input.nextDouble();
        input.close();

        if (salario <= 280.00) {
            valordoaumento = salario * 20 / 100;
            novosalario = salario + valordoaumento;
            System.out.println("Seu salário antes do reajuste é: " + salario + "R$");
            System.out.println("Seu percentual de aumento é de: 20%");
            System.out.println("O aumento de seu salário é de: " + valordoaumento + "R$");
            System.out.println("Seu novo salário é de: " + novosalario + "R$");
        } else if (salario <= 700.00)  {
            valordoaumento = salario * 15 / 100;
            novosalario = salario + valordoaumento;
            System.out.println("Seu salário antes do reajuste é: " + salario + "R$");
            System.out.println("Seu percentual de aumento é de: 15%");
            System.out.println("O aumento de seu salário é de: " + valordoaumento + "R$");
            System.out.println("Seu novo salário é de: " + novosalario + "R$");
        } else if (salario <= 1499.00) {
            valordoaumento = salario * 10 / 100;
            novosalario = salario + valordoaumento;
            System.out.println("Seu salário antes do reajuste é: " + salario + "R$");
            System.out.println("Seu percentual de aumento é de: 10%");
            System.out.println("O aumento de seu salário é de: " + valordoaumento + "R$");
            System.out.println("Seu novo salário é de: " + novosalario + "R$");
        }  else if (salario >= 1500.00) {
            valordoaumento = salario * 5 / 100;
            novosalario = salario + valordoaumento;
            System.out.println("Seu salário antes do reajuste é: " + salario + "R$");
            System.out.println("Seu percentual de aumento é de: 5%");
            System.out.println("O aumento de seu salário é de: " + valordoaumento + "R$");
            System.out.println("Seu novo salário é de: " + novosalario + "R$");
        }


    }
}







