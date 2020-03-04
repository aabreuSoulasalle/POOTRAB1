package com.montagem.manutencao;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		Maquina maquina = new Maquina();
		
		cliente.cadastroCliente();
		maquina.cadastraMaquina();
		maquina.mudaStatus();
		maquina.statusServico();
		maquina.servicoOrcamento();
		

	}

}
