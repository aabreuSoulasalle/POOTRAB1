package com.montagem.manutencao;

import java.util.Scanner;

public class Cliente extends Maquina {
	String CodCliente; 
	String Nome;
	String CodMaquina;
	String Endereco;
	String Telefone;
	Scanner input = new Scanner(System.in);
	
	void cadastroCliente() {
		System.out.println("Digite seu nome:");
		this.Nome = input.next();
		System.out.println("Digite o codigo do cliente:");
		this.CodCliente = input.next();
		System.out.println("Digite seu endereço:");
		this.Endereco = input.next();
		System.out.println("Digite seu Telefone:");
		this.Telefone = input.next();
		this.cadastraMaquina();
	}
	
		
	

}
