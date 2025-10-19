package atividade;



public class CalculadoraGeometria {

    Double lado, area;
    
    public CalculadoraGeometria (Double lado){
       this.lado = lado;
    }
    
    public void calcularAreaQuadrado (){
        area = lado*lado;
        System.out.println("O valor da área é " + area + " metros quadrados");
    }

}
