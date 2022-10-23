package br.com.programacao.logica.lacosderepeticao.whiles;

import java.util.Scanner;

/*
Como usuário gostaria de ter um menu visual que seja navegavel através de numeros,
O MENU DEVE SER EXIBIDO DA SEGUINTE FORMA :
1 - Calcular imposto
2 - Depositar salario
3 - Sair
O menu deve ficar disponivel enquanto não aperar a opção 3.
 */
public class Ex02Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao !=3){
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Depositar salario");
            System.out.println("3 - Sair");
            opcao = input.nextInt();

        }
    }
}

