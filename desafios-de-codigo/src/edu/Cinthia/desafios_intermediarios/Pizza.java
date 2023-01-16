package edu.Cinthia.desafios_intermediarios;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        final int FATIAS_POR_PIZZA = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int i = 0;
        int [] N = new int[T]; // N para o número de amigos
        int [] X = new int[T]; // X para a quantidade de fatia que cada amigo deseja
        int [] quantidadePizza = new int[T];
        int [] quantidadeFatia = new int[T];

        while(i<T) { // entrada de dados
            N[i] = scanner.nextInt();
            X[i] = scanner.nextInt();
            i = i + 1;
        }

        i=0;
        while(i<T) { // cálculo da quantidade de pizzas
            quantidadeFatia[i] = N[i]*X[i];
            quantidadePizza[i] = quantidadeFatia[i]/FATIAS_POR_PIZZA;
            if(quantidadeFatia[i]%FATIAS_POR_PIZZA!=0){
                quantidadePizza[i] = quantidadePizza[i] + 1;
            }
            i = i + 1;
        }

        i=0;
        while(i<T) { // saída de dados
            System.out.println(quantidadePizza[i]);
            i = i + 1;
        }

    }
}
