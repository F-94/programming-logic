package br.com.programacao.logica.variaveis;
// Dado o salário de 500, crie uma variavel que guarde o valor de um salário.
//Calcule a porcentagem desse salário, sendo os valores da porcentagem 30%, 15% e 5%.
//A cada vez que calcular guarde o resultado em uma variavel, imprima o resultado e reutilize a variavel guardada para um novo calculo;
public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println("30% do salário é : " + resultado);
        resultado = salario * 0.15;
        System.out.println("15% do salário é : " + resultado);
        resultado = salario * 0.05;
        System.out.println("30% do salário é : " + resultado);


    }
}
