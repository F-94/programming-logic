package br.com.programacao.logica.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da
//multiplicação dos números do V1 com os correspondentes em V2
//Exemplo:
//V1 1 2 3 4 5 6 7 8 9
//V2 2 3 4 5 6 7 8 9 0
//VR 2 6 12 20 30 42 56 72 0
public class Ex02Vetores {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {2,3,4,5,6,7,8,9,0};
        int[] vr = new int[9];

        for (int i = 0; i < v1.length; i++) {
            vr[i] = v1[i] * v2[i];
        }

        for (int j = 0; j < v1.length; j++) {
            System.out.println(vr[j]);

        }


    }
}

