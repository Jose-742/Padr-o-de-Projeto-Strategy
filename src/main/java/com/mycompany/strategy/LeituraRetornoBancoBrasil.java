package com.mycompany.strategy;

import com.mycompany.strategy.model.Boleto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class LeituraRetornoBancoBrasil implements LeituraRetorno {

	@Override
	public List<Boleto> lerArquivo(String nomeArquivo) {
		System.out.println("Lendo arquivo BB: " + nomeArquivo);

		var listaBoletos = new LinkedList<Boleto>();

		try {
			var linhas = Files.readAllLines(
					Paths.get("E:/JAVA/Ws-eclipse-2/Strategy/src/main/java/com/mycompany/strategy/banco-brasil-1.csv"));
			for (String linha : linhas) {
				var vetor = linha.split(";");

				var formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				var boleto = new Boleto();
				boleto.setId(Integer.parseInt(vetor[0]));
				boleto.setCodBanco(vetor[1]);
				boleto.setDataVencimento(LocalDate.parse(vetor[2], formatoData));
				boleto.setDataPagamento(LocalDate.parse(vetor[3], formatoData).atStartOfDay());
				boleto.setCpfCliente(vetor[4]);
				boleto.setValor(Double.parseDouble(vetor[5]));
				boleto.setMulta(Double.parseDouble(vetor[6]));
				boleto.setJuros(Double.parseDouble(vetor[7]));

				listaBoletos.add(boleto);
			}

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

		return listaBoletos;
	}

}
