package maratona.java.luis.hermes;

public class Aula04Operadores {

    public static void main(String[] args) {

            int numero01 = 10;
            int numero02 = 20;
            int resultado = numero01+numero02; // soma
            // int resultado = numero01 * numero02; // multiplicação
            // int resultado = numero01 / numero02; // divisão , quando a divição nao der exata , voce cola um int e outro dooble , ou coloca (dooble) + numero02 , ai da certo mais o codigo fica feio entao nao ponha :) .
            System.out.println(resultado);
            //System.out.println(numero01+numero02); // soma ponha o mais ali e e for diminuir ponha o menos ali no meio .

            // %
            int resto = 20 % 2;
            System.out.println(resto);

            // < > maior esquerda , maior direita <= menor igual >= maior igual == coparando a variavel !=
            boolean isDezMaiorQueVinte = 10 > 20;
            boolean isDezMenorQueVinte = 10 < 20;
            boolean isDezIgualQueVinte = 10 == 20;
            boolean isDezIgualQueDez = 10 == 10;
            boolean isDezDiferenteQueDez = 10 != 10;


            System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
            System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
            System.out.println("isDezIgualQueVinte " +isDezIgualQueVinte);
            System.out.println("isDezIgualQueDez " +isDezIgualQueDez);
            System.out.println("isDezDiferenteQueDez " +isDezDiferenteQueDez);



        }
    }
