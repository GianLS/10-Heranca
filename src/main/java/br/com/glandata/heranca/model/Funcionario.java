package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario extends Pessoa {
	public Funcionario(Integer registro, String nome) {
		this.registro = registro;
		this.nome = nome;
		System.out.println("Mensagem vinda da Classe Funcionario");
	}

	@Getter
	@Setter
	private Integer registro;

	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private float salario;

	public void imprimeNome() {
		System.out.println("Este é o funcionário: " + this.nome);
	}
	
	
}
