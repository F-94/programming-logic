package br.com.programacao.logica.estruturascondicionais.ifelse;
// dado um número inteiro, verifica se é par
public class VerificaPar {
    public static void main(String[] args) {
        int numero = 115;
        if(numero % 2 == 0){
            System.out.println("o número é par");
        }else{
            System.out.println("número é impar");
        }
    }
}
