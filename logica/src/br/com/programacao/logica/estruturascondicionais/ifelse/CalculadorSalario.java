package br.com.programacao.logica.estruturascondicionais.ifelse;
//Dado um determinado salário, se o valor for maior que 4500 imprima 30% do valor, senão imprima 15% do valor.

public class CalculadorSalario {
    public static void main(String[] args) {
        double salario = 2000;
        if(salario > 4500){
            System.out.println( "seu salario é maior que 4500, portanto 30% do valor é: "+ salario * 0.3);
        }else{
            System.out.println("seu salario é menor que 4500, portanto 15% do valor é: " + salario * 0.15);
        }
    }
}
