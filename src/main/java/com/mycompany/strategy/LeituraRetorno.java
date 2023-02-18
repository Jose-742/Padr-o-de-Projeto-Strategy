package com.mycompany.strategy;

import com.mycompany.strategy.model.Boleto;
import java.util.List;

public interface LeituraRetorno {

	List<Boleto> lerArquivo(String nomeArquivo);

}
