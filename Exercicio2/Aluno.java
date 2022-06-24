package Exercicio2;

public class Aluno {
    String nome;
    int idade;
    private double media;

    public void calcularMedia(double n1, double n2, double n3) {
        this.media = (n1 + n2 + n3) / 3;
        System.out.println("A média do aluno é: " + this.media);
    }

    public void verificarAprovacao() {
        if (this.media < 5) {
            System.out.println("O aluno foi reprovado!");
            return;
        } 

        if (this.media < 7) {
            System.out.println("O aluno está em exame!");
            return;
        } 
        
        System.out.println("O aluno foi aprovado!");        
    }
}
