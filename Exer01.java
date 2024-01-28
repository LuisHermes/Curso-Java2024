package primeiro.pacote.curso.java.dev.dojo;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu Ultimo nome: ");
        String nome2 = scan.next();

        String resultado = nome + nome2;
        System.out.println("Seu nome Completo é: " + resultado);
    }
}
