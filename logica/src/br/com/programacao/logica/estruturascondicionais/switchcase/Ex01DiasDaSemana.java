package br.com.programacao.logica.estruturascondicionais.switchcase;

import java.util.Scanner;

/*
Escreva um programa que informe os dias da semana de 1 a 7, número 1 domingo
 */
public class Ex01DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o dia da semana: ");
        int dia = input.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println(" Digite um número de 1 a 7");

        }
    }
}
