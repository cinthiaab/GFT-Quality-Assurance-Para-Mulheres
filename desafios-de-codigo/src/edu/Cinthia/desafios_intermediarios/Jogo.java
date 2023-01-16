package edu.Cinthia.desafios_intermediarios;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();
        String resultado;

        if(jogadaInimigo==jogadaJogador){
            resultado =  "Empatou";
        } else if (verificarJogador1Venceu(jogadaJogador, jogadaInimigo)==true) {
            resultado =  "Ganhou";
        } else {
            resultado =  "Perdeu";
        }
        System.out.println(resultado);
    }
    public static boolean verificarJogador1Venceu (int j1, int j2){
        boolean venceu=false;
        if((j1==1 &  j2==3) | (j1==2 & j2==1) | (j1==3 & j2==2)){
            venceu = true;
        }
        return venceu;
    }
}
