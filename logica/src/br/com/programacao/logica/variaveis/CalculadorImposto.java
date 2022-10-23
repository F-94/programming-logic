package br.com.programacao.logica.variaveis;
//Crie um programa que calcule um imposto de 30% sobre um salario de 2500;
public class CalculadorImposto {
    public static void main(String[] args) {
        float salario = 2500F;
        float porcentagem = 30;
        float impostoDoSalario = salario * porcentagem / 100;
        System.out.println(impostoDoSalario);


    }
}
