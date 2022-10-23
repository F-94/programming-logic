package br.com.programacao.logica.lacosderepeticao.whiles;

import java.util.Scanner;

/*
Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
senha corretos devem estar armazenados em constantes no seu programa. Se o
usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO, caso
contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
essa condição deve-se repetir até que o usuário acerte a combinação.
 */
public class Ex03Login {
    public static void main(String[] args) {
        int senha = 1234;
        String usuario = "admin";
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Digite o usuário: ");
            usuario = input.next();
            System.out.println("Digite a senha : ");
            senha = input.nextInt();
            if (senha == 1234 && usuario.contentEquals("admin")){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
                System.out.println("ACESSO NEGADO");

            }
        }

    }
