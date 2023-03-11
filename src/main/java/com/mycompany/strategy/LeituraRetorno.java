package com.mycompany.strategy;

import java.time.format.DateTimeFormatter;

import com.mycompany.strategy.model.Boleto;

public interface LeituraRetorno {
	public static DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static DateTimeFormatter FORMATO_DATA_TIME = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq);
}
