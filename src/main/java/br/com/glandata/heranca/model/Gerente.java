package br.com.glandata.heranca.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Gerente extends Funcionario {

	public Gerente(Integer registro, String nome) {
		super(registro, nome);
	}

	@Setter
	private float salario;

	@Getter
	@Setter
	private boolean acessoContas;
	
	@Override
	public float getSalario() {
		return this.salario*1.5f;
	}
}
