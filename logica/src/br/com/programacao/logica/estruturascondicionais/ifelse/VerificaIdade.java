package br.com.programacao.logica.estruturascondicionais.ifelse;
//Receba uma idade como variavel se  maior que 18 imprima adulto, caso contrário imprima menor de idade.
public class VerificaIdade {
    public static void main(String[] args) {


        int idade = 15;

        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade");
        }

    }
}