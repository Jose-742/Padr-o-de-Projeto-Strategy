package com.mycompany.strategy;

import com.mycompany.strategy.model.Boleto;

public class ProcessarBoleto {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoleto(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
    
    public void processar(String nomeArquivo){
      var listaBoletos =  leituraRetorno.lerArquivo(nomeArquivo);
      for(Boleto boleto : listaBoletos){
          System.out.println(boleto);
      }
      System.out.println("");
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
