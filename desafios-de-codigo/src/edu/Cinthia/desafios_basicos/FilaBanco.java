package edu.Cinthia.desafios_basicos;
import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);
        int k;

        for(int i=0; i<3; i++){
            nomesFila[i] = nome.next();
        }

        for(int i=0; i<3; i++){
            k = i+1;
            System.out.println(nomesFila[i] + " - esta na posicao: " + k);
        }
    }
}
