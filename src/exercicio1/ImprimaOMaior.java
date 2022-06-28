package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;

    public class ImprimaOMaior {
        public static void main(String[] args) {
            List<Integer> valores = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            valores.add(input.nextInt());
            System.out.println("Digite o segundo valor: ");
            valores.add(input.nextInt());
            input.close();

            if (valores.get(0) > valores.get(1)) {
                System.out.println("O menor valor é: " + valores.get(0));
            } else System.out.println("O menor valor é: " + valores.get(1));


        }
}
