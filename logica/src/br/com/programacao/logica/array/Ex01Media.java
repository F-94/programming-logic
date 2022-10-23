package br.com.programacao.logica.array;

import java.util.Scanner;

// dado 4 notas pelo usuário, crie um programa que calcule a média
public class Ex01Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("digite a nota " + (i + 1));
            notas[i] = input.nextDouble();
            soma += notas[i];
        }
        System.out.println("A média é: " + soma / notas.length);


    }
}
