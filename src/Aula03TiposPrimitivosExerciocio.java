package maratona.java.luis.hermes;
public class Aula03TiposPrimitivosExerciocio {

    public static void main(String[] args) {
        String nome = "Luis";
        String endereco = "Via Costa Masnaga Nº15 ";
        double salario = 3500.15;
        String dataRecebimentoSalario = "24/01/2024"; // Para inserir data no programa usar string do geito que esta ali.
        String relatorio = "Eu "+nome+ "Estou morando  no endereço "+endereco+" Confirmo que recebi o salario "+salario+",na data de "+dataRecebimentoSalario;
        System.out.println(relatorio); // Ao enves de fazer varios Sout igual em baixo , pode fazer uma String relatorios como aqui em sima ( colocar tudo dentro de uma String).

        // System.out.println("Eu: " + nome +  "Moro no endereço : " + endereco + "Confirmo que recebi o Salario de : " + salario);

        /*System.out.println(" Eu " +nome);
        System.out.println(" Estou morando no endereço " +endereco);
        System.out.println(" Confirmo que recebi o salario de " +salario);
        System.out.println(" Data de Recebimento do Salario " +dataRecebimentoSalario);*/
    }

}
