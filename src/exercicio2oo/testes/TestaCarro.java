package exercicio2oo.testes;

import exercicio2oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Viper";
        c1.marca = "Dodge";
        c1.ano = "2009";
        c1.velocidade = "365 Km";
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Marca: " + c1.marca);
        System.out.println("Ano: " + c1.ano);
        System.out.println("Velocidade: " + c1.velocidade);
    }
}
