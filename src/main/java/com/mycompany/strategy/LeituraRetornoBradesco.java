package com.mycompany.strategy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.mycompany.strategy.model.Boleto;

public class LeituraRetornoBradesco implements LeituraRetorno {

	@Override
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq) {
		var boleto = new Boleto();
		boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
		boleto.setCodBanco(vetorLinhaArq[1]);
		boleto.setAgencia(vetorLinhaArq[2]);
		boleto.setContaBancaria(vetorLinhaArq[3]);
		boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[4], FORMATO_DATA));
		boleto.setDataPagamento(LocalDateTime.parse(vetorLinhaArq[5], FORMATO_DATA_TIME));
		boleto.setCpfCliente(vetorLinhaArq[6]);
		boleto.setValor(Double.parseDouble(vetorLinhaArq[7]));
		boleto.setMulta(Double.parseDouble(vetorLinhaArq[8]));
		boleto.setJuros(Double.parseDouble(vetorLinhaArq[9]));
		return boleto;
	}

}
