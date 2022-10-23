package br.com.programacao.logica.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuário (login) no sistema para agilizar
o processo de admissão do sistema antigo para o novo
O usuário não pode deixar o login vazio ("") ou criar um login com "admin" ou "administrador"
Se o valor entrado for valido o sistema deve exibir uma mensagem <nome de usuario> cadastrado com sucesso, senão exibir o erro Usuario inválido.
 */
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o nome de usuário: ");
        String nomeDeUsuario = input.next();
        if (nomeDeUsuario.equals("") || nomeDeUsuario.equalsIgnoreCase("admin") || nomeDeUsuario.equalsIgnoreCase( "administrador")){
            System.out.println(" usuário invalido");
        } else {
            System.out.println(nomeDeUsuario + " cadastrado com sucesso");
        }
    }
}