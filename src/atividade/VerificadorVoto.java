package atividade;


public class VerificadorVoto {
    
    //atributo
    int idade;
    
    
    //construtor
    public VerificadorVoto (int idade){
        this.idade = idade;
                
    }
    
    
    //metodo
    public void podeVotar () {
        if (this.idade >= 16) {
            System.out.println("Pode votar");
        }
        else {
            System.out.println("Não pode votar");
        }
    }   
    
}
