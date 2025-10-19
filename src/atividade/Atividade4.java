package atividade;

import java.util.Scanner;

public class Atividade4 {

    String nome, nome2;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        Atividade4 obj = new Atividade4();

        System.out.println("Digite o seu 1º nome (com espaço)");
        obj.nome = sc.nextLine();

        System.out.println("Digite o seu 2º nome");
        obj.nome2 = sc.next();

        FormatadorNome nome1 = new FormatadorNome(obj.nome, obj.nome2);

        nome1.montarNomeCompleto();

    }

}
