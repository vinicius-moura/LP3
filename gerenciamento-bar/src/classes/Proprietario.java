package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Proprietario extends Funcionario{

	String abc[] = {
			"Registrar Fornecedor", 
			"Remover Fornecedor",
			"Gerar Desafio",
			"Modificar menu",
			"Acessar relatorio",
			"Adicionar funcionario",
			"Remover funcionario",
			
	};
	
	List lista = Arrays.asList(abc);
	ArrayList opcao = new ArrayList(lista);	
	
	public String idTela(String nomeOp)
	{
		int id = opcao.indexOf(nomeOp);
		
		return "p" + Integer.toString(id);
		
	}
	
	
}
