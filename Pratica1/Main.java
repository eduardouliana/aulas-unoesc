package Pratica1;

import Pratica1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
            "Eduardo",
            27
        );

        pessoa1.exibirInfo();

        Pessoa pessoa2 = new Pessoa(
            "Dudu",
            27
        ); 
               
        pessoa2.exibirInfo();
    }
}
