package edu.Cinthia.desafios_intermediarios;
import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean numeroFeliz = false;
        int n = scan.nextInt();
        int soma=0;
        int digito;
        if(n%10==n | n%10==0){
            soma = n;
        }

        while (n%10!=0 & soma%10!=n) {
            soma=0;
            do {
                digito = n % 10;
                soma = soma + digito*digito;
                n = n / 10;
            }while (n%10!=0);
            n = soma;
        }
        while(soma%10==0){
            soma = soma / 10;
        }
        if(soma==1){
            numeroFeliz = true;
        }

        System.out.println(numeroFeliz);;
    }
}
