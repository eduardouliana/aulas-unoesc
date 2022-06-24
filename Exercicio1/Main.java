package Exercicio1;

import java.util.Scanner;
import Exercicio1.Calculadora;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        scan.close();
        
        Calculadora calculadora = new Calculadora();
        calculadora.somar(n1, n2);
        calculadora.subtrair(n1, n2);
        calculadora.multiplicar(n1, n2);
        calculadora.dividir(n1, n2);        
    }
}
