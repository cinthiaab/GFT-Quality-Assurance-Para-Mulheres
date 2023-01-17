package edu.Cinthia.desafios_basicos;
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        float media = (idade1 + idade2 + idade3)/3;

        if(media<26){
            System.out.println("Jovem!");
        }else if(media<61){
            System.out.println("Adulta!");
        }else{
            System.out.println("Idosa!");
        }
    }
}
