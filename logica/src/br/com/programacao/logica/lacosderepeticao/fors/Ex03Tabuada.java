package br.com.programacao.logica.lacosderepeticao.fors;
// Escreva um programa que de a tabuada do 1 ao 10
public class Ex03Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Tabuada do número : " + i);
            for (int j = 1; j <=10 ; j++) {

                System.out.println(i+ " x " +j +" = "+ i*j);
            }

        }
    }
}
