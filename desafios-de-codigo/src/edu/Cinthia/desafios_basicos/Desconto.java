package edu.Cinthia.desafios_basicos;
import java.util.Scanner;

public class Desconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();
        int desconto = 100 - (100*S/M);

        System.out.println("O desconto foi de " + desconto + "%");
    }
}
