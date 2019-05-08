package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caixa extends Funcionario {

	/* Gerar uma versão mais simples de criar uma ArrayList */
	String abc[] = {
		    "Abrir mesa", 
			"Fechar mesa",
			"Pagamento"
		};
	List lista = Arrays.asList(abc);
	ArrayList opcao = new ArrayList(lista);		
	
	public String idTela(String nomeOp)
	{
		int id = opcao.indexOf(nomeOp);
		
		return "c" + Integer.toString(id);
		
	}
	
}


