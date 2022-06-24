package Exercicio2;

import Exercicio2.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Eduardo";
        aluno1.idade = 27;
        aluno1.calcularMedia(6.0, 7.0, 8.0);
        aluno1.verificarAprovacao();
    }
    
}
