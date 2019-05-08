package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garcom extends Funcionario{
	

	String abc[] = {
			"Marcar pedido", 
			"Retirar pedido"
	};

	List lista = Arrays.asList(abc);
	ArrayList opcao = new ArrayList(lista);	
	
	public String idTela(String nomeOp)
	{
		int id = opcao.indexOf(nomeOp);
		
		return "g" + Integer.toString(id);
		
	}
	
}
