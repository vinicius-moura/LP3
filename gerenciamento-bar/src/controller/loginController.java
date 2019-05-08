package controller;

import java.awt.event.ActionEvent;

import classes.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {
	
    @FXML
    private Label lbl_usuarioLogado;

    @FXML
    private TextField txt_usuario;

    @FXML
    private PasswordField psw_senha;
    
    @FXML
    protected Funcionario logar(ActionEvent e) {    	
    	//pega valores do txt_
    	//faz pesquisa no banco com DAO
	    	/*
	    	 * if(usuario.cargo == "caixa")
	    	 * 		Funcionario = new Caixa
	    	 * else if (...)
	    	 * 	...
	    	 * */
    	//retornando o tipo objeto e dados
    	Funcionario f = new Proprietario();
    	f.setNome("NomeProprietario");
    	lbl_usuarioLogado.setText(f.getNome());
    	return f;
    }

}
