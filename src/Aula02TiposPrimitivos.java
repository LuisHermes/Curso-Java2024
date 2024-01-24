//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package maratona.java.luis.hermes;
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        // Tipos primitivos.
        // int idade = 10; / O certo e assim , nao por o (int) para trocar variavel , se quiser trocar variavel , troca a variavel inteira , int para long.
        int idade = (int) 100000000L; // O (int) esta ali por que o numero e muito grande ,quando o numero e muito grande ele é long ( tipo da variavel )
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 10;
        String nome = "Luis"; // Textos grandes ou nomes .





        System.out.println("A idade é " + idade + " anos ");
        System.out.println(falso);
        System.out.println("Oi meu nome é : " + nome);



    }
}