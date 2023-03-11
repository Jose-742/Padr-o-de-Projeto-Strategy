
package com.mycompany.strategy;

public class Strategy {

    public static void main(String[] args) {     
    	
    	String caminho = "E:/JAVA/Ws-eclipse-2/Padr-o-de-Projeto-Strategy/src/main/java/com/mycompany/strategy/";
    		
        ProcessarBoleto processaBoletoBrasil = new ProcessarBoleto( new LeituraRetornoBancoBrasil());    
        processaBoletoBrasil.processar(caminho+"banco-brasil-1.csv");
                
        ProcessarBoleto processaBoletoBradesco =new ProcessarBoleto( new LeituraRetornoBradesco());
        processaBoletoBradesco.processar(caminho+"bradesco-1.csv");
    }
}
