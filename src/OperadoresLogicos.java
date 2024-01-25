package luis.maratona.java;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // && - significa , eu vou comprar babana e maça (and)
        // ||   , eu vou de taxi ou se minha mae me levar (or)
        // ! = esse tem que pesquisar

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrista = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrista = idade < 30 && salario <= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrista);
        System.out.println(isDentroDaLeiMenorQueTrista);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %/
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // Bonus multiplicado por ele mesmo.
        bonus /= 2;
        bonus %= 2;


        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador
        contador++;
        contador--;
        System.out.println(contador);



    }
}
