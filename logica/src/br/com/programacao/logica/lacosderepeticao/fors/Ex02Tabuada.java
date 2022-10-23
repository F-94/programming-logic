package br.com.programacao.logica.lacosderepeticao.fors;

import java.util.Scanner;

//Elaborar um programa que calcule e apresente a tabuada de um número qualquer
public class Ex02Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o número da tabuada: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);

        }
    }
}
