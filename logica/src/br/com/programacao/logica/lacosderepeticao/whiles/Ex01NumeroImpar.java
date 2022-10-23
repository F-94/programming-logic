package br.com.programacao.logica.lacosderepeticao.whiles;
// Crie um programa que imprima os números impar de 0 até 1000
public class Ex01NumeroImpar {
    public static void main(String[] args) {
        int numero = 0;
        while (numero <= 1000) {
            if (numero % 2 == 1) {
                System.out.println("número = " + numero);
            }
            numero++;
        }
    }
}

