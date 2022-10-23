package br.com.programacao.logica.estruturascondicionais.switchcase;

import java.util.Locale;
import java.util.Scanner;

/*
Como gerente eu gostaria que meu usuário pudessem digitar o tipo de conta e o sistema imprima qual a porcentagem
de juros que aquela conta oferece. Com o intuito de agilizar os processos os tiós de contas são:
CONTA_CORRENTE 0.05%
CONTA_POUPANÇA 0.02%
CONTA_INVESTIMENTO 0.01%
 */
public class Ex02TipoDeConta {
    public static void main(String[] args) {

        String conta = "CONTA POUPANÇA" ;

        switch (conta){
            case "CONTA POUPANÇA" :
                System.out.println(" 2%");
                break;
            case "CONTA CORRENTE":
                System.out.println(" 5% ");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println(" 1%");
            default:
                System.out.println(" tipo de conta inválida");

        }
    }
}
