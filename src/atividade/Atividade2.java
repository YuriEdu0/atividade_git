package atividade;

import java.util.Scanner;

public class Atividade2 {

    Double lado;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atividade2 obj = new Atividade2();

        System.out.println("Para descobrir a área do quadrado digite o valor da área: ");
        obj.lado = sc.nextDouble();
        
        CalculadoraGeometria lado1 = new CalculadoraGeometria(obj.lado);
        
        lado1.calcularAreaQuadrado();        
    }

}
