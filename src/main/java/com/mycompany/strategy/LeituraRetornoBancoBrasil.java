package com.mycompany.strategy;

import java.time.LocalDate;
import com.mycompany.strategy.model.Boleto;

public class LeituraRetornoBancoBrasil implements LeituraRetorno {

	@Override
	public Boleto processarLinhaArquivo(String[] vetorLinhaArq) {
		var boleto = new Boleto();
		boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
		boleto.setCodBanco(vetorLinhaArq[1]);
		boleto.setDataVencimento(LocalDate.parse(vetorLinhaArq[2], FORMATO_DATA));
		boleto.setDataPagamento(LocalDate.parse(vetorLinhaArq[3], FORMATO_DATA).atStartOfDay());
		boleto.setCpfCliente(vetorLinhaArq[4]);
		boleto.setValor(Double.parseDouble(vetorLinhaArq[5]));
		boleto.setMulta(Double.parseDouble(vetorLinhaArq[6]));
		boleto.setJuros(Double.parseDouble(vetorLinhaArq[7]));
		return boleto;
	}

}
