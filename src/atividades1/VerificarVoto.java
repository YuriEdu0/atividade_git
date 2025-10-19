/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades1;

/**
 *
 * @author oem
 */
public class VerificarVoto {
    
    int idade;
    
    public VerificarVoto( int idade){
        this.idade = idade;
    }
    
    public void podeVotar(){
        if (this.idade >= 16) {
            System.out.println("Pode votar");
        }
        else {
            System.out.println("Voce nao pode votar");
        }
    }
    
}
    