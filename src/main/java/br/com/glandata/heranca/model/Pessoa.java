package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {
	public Pessoa() {
		System.out.println("Mensagem Vindo da Classe Pessoa");
	}
	
	@Getter
	@Setter
	private Integer idade;
	
	@Getter
	@Setter
	private String endereco;
	
	
}
