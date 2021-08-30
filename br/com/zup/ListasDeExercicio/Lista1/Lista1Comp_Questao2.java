package br.com.zup.ListasDeExercicio.Lista1;

public class Lista1Comp_Questao2 {
    public static void main(String[] args) {
        float  metros = 600;
        float qtdLitros = metros/6;

        float lataGrande = qtdLitros / 18;
        float lataPequena = qtdLitros / 3.6F;

        float precoGrande = 80 * lataGrande;
        float precoPequena = 25 * lataPequena;

        System.out.println("Para comprar apenas latas grandes você precisará de " + lataGrande + " latas e custará R$" + precoGrande);
        System.out.println("Para comprar apens latas pequenas você precisará de " + lataPequena + " latas e custará R$" + precoPequena);
    }
}
