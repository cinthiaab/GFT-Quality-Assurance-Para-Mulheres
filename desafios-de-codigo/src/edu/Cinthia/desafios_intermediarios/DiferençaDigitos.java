package edu.Cinthia.desafios_intermediarios;
import java.util.Arrays;
import java.util.Scanner;

public class DiferençaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        int soma = 0;
        int produto = 1;

        for(int i=0; i < ints.length; i++) {
            soma = soma + ints [i];
            produto = produto * ints[i];
        }

        int resultado = produto - soma;

        System.out.println(resultado);
    }
}
