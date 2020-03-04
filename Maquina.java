package com.montagem.manutencao;

import java.util.Scanner;

public class Maquina {
	String CodMaquina;
	String Modelo;
	String TipoServico;
	float Orcamento;
	String Status;
	boolean Sucesso = false;
	Scanner input = new Scanner(System.in);
	String res;
	void mudaStatus() {
		System.out.println("Digite oStatus atual:");
		this.Status = input.next();
	}
	
	void statusServico() {
		System.out.println("Modelo:"+this.Modelo);
		System.out.println("Codigo da maquina: " + this.CodMaquina);
		System.out.println("Status: " + this.Status);
	}
	
	void servicoOrcamento() {
		if(this.Orcamento!= 0) {
			System.out.println("Orçamento ja esta preenchido, se deseja alterar digite ok?");
			res = input.next();
		}
		if(this.Orcamento == 0 || res == "ok") {
			this.Orcamento = input.nextFloat();
			this.TipoServico = input.next();
			this.Status = input.next();
		}
		
	}
	
	void cadastraMaquina() {
		res = "";
		System.out.println("Digite o codigo da maquina:");
		this.CodMaquina = input.next();
		System.out.println("Digite o modelo da maquina:");
		this.Modelo = input.next();
		System.out.println("Qual tipo de serviço:");
		this.TipoServico = input.next();
		System.out.println("Deseja Registrar Orçamento, digite ok?");
		res = input.next();
		if(res=="ok") {
			this.servicoOrcamento();
		}
	}

}
