package br.com.programacao.logica.estruturascondicionais.ifelse;
/*
Como secretario de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros para que eu possa agilizar o processo de cadastramento:
Sexo, sendo válido apenas M ou F e idade.
Se o sexo for masculino e a idade maior ou igual a 18 o sistema deve imprimir ,alistamento obrigatório
Se o sexo for masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo for feminino e a idade maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
 */

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu sexo ");
        Character sexo = input.next().charAt(0);
        System.out.println("digite sua idade: ");
        int idade = input.nextInt();
        if (sexo.equals('M') && idade >= 18) {
            System.out.println("alistamento obrigatório");
        } else if (sexo.equals('M') && idade <= 18) {
            System.out.println("alistamento não permitido");
        } else if (sexo.equals('F') && idade > 18) {
            System.out.println ("alistamento não permitido");
        } else if  (sexo.equals('F') && idade <= 18) {
            System.out.println("Você gostaria de se alistar? ");
        }else{
            System.out.println("parâmetros inválidos");
        }
    }
}
