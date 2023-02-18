
package com.mycompany.strategy;

public class Strategy {

    public static void main(String[] args) {     
        var processador = new ProcessarBoleto(new LeituraRetornoBancoBrasil());    
        processador.processar("banco-brasil-1.csv");
         
       
        processador = new ProcessarBoleto(new LeituraRetornoBradesco());
        processador.processar("bradesco-1.csv");
    }
}
