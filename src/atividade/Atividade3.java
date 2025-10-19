package atividade;

import java.util.Scanner;

public class Atividade3 {

    Double cel;
    
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Atividade3 obj = new Atividade3();
        
        System.out.println("Digite a temperatura em graus celsius: ");
        obj.cel= sc.nextDouble();
        
        ConversorTemperatura con1 = new ConversorTemperatura(obj.cel);
        
        con1.celsiusParaFahrenheit();
        
        
    }
}
