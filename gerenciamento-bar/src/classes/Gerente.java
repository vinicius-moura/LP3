package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gerente extends Funcionario{
	
	String abc[] = {
			"Encomendar fornecedor", 
			"Modificar item fornecedor", 
			"Ver estoque"
	};
	
	List lista = Arrays.asList(abc);
	ArrayList opcao = new ArrayList(lista);	
	
	public String idTela(String nomeOp)
	{
		int id = opcao.indexOf(nomeOp);
		
		return "ge" + Integer.toString(id);
		
	}

}
