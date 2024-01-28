package primeiro.pacote.curso.java.dev.dojo;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int valor1 = scan.nextInt();

        System.out.println("Digite mais um numero:");
        int valor2 = scan.nextInt();

        int resultado = (valor1 + valor2);
        System.out.println("Seu resultado é : " + resultado);
    }
}
