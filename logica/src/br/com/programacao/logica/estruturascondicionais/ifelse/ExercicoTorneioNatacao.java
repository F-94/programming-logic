package br.com.programacao.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

/* Eu como usuário gostaria de ter o nome e a idade de um torneio de natação e que o sistema imprimisse da seguinte forma:
Menor que 10 anos: <nome> participa da categoria infantil.
entre 11 e 15 anos: <nome> participa da categoria juvenil.
entre 16 e 19 anos: <nome> participa da categoria pré adulto.
Acima de 20 anos: <nome> participa da categoria adulto.
Para que eu possa rapidamente classificar todos os participantes.


 */
public class ExercicoTorneioNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = input.next();
        System.out.println("digite a idade: ");
        int idade = input.nextInt();
        if (idade < 10) {
            System.out.println(nome + " Participa do torneio infantil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participa do torneio pré adulto");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participa do torneio juvenil");
        } else {
            System.out.println(nome + " Participa do torneio adulto");
        }

    }
}