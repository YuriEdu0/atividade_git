package atividade;

import java.util.Scanner;

public class Atividade {

    int idade;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atividade obj = new Atividade();

        System.out.println("Digite sua idade para saber se pode votar: ");

        obj.idade = sc.nextInt();

        VerificadorVoto vt1 = new VerificadorVoto(obj.idade);

        vt1.podeVotar();

    }

}
