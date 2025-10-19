package atividade;



public class ConversorTemperatura {
 
    Double cel, far;
    
    public ConversorTemperatura (Double cel){
        this.cel = cel;
    }
    
    public void celsiusParaFahrenheit (){
        far =  cel * 1.8 + 32;
        System.out.println(cel + "°C é " +far+"°F");
    }
    
}




