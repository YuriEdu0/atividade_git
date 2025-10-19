package atividade;

public class FormatadorNome {

    String nome, nome2, nomecomp;
    
    public FormatadorNome (String nome, String nome2) {
        this.nome = nome;
        this.nome2 = nome2;
    }
    
    
    public void montarNomeCompleto(){
        nomecomp = nome + nome2;
        System.out.println("O seu nome completo é: "+ nomecomp);
        
    }

}
