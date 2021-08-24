package br.com.zup;

public class Lista1_Questao6 {
    public static void main(String[] args) {
        float valorHora = 5.2F;
        float qtdHoras = 250;
        float salarioBruto = valorHora * qtdHoras;
        float inss = salarioBruto * 0.11F;
        float sindicato = salarioBruto * 0.05F;

        float salarioLiquido = salarioBruto - inss - sindicato;

        System.out.println("O valor do salário Bruto é R$" + salarioBruto);
        System.out.println("O valor pago ao INSS é R$" + inss);
        System.out.println("O valor pago ao sindicato é R$" + sindicato);
        System.out.println("O valor do seu salário líquido é R$" +salarioLiquido);
    }
}
