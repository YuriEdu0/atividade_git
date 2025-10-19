package atividades1;

import java.util.Scanner;

public class Atividades1 {

    int idade;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade para saber se pode votar: ");

        Atividades1 atividade = new Atividades1();
        atividade.idade = sc.nextInt();
        
        VerificarVoto vt1 = new VerificarVoto (atividade.idade);
        vt1.podeVotar();
    }

}
