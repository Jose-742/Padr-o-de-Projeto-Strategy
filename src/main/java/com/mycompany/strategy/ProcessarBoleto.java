package com.mycompany.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.strategy.model.Boleto;

public class ProcessarBoleto {	
	
	private LeituraRetorno leituraRetorno;
	
	public ProcessarBoleto(LeituraRetorno leituraRetorno) {
		this.leituraRetorno = leituraRetorno;
	}  
	
    public void processar(String caminhoArquivo){
      var listaBoletos =  lerArquivo(caminhoArquivo);
      
      for(Boleto boleto : listaBoletos){
          System.out.println(boleto);
      }
      System.out.println("");
    }
    
    public final List<Boleto> lerArquivo(String caminhoArquivo) {
		try {
			BufferedReader reader = Files.newBufferedReader(Paths.get(caminhoArquivo));
			String line;
			List<Boleto> boletos = new ArrayList<>();
			while((line = reader.readLine()) != null) {
				String[] vetor = line.split(";");
				Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);
				boletos.add(boleto);
				
			}
			return boletos;
		}catch (IOException ex) {
			throw new UncheckedIOException(ex);
		}
	}
}
