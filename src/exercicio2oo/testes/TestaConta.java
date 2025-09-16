package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

class TestaConta {
    public static void main(String[] args){
        ContaBancaria cb = new ContaBancaria();
        cb.numeroconta = "123";
        cb.titular = "Dandari";
        cb.saldo = "5.600.000,00";
        System.out.println("Numero da Conta: " + cb.numeroconta);
        System.out.println("Titular: " + cb.titular);
        System.out.println("Saldo da Conta: " + cb.saldo);

    }
}
