package br.com.glandata.heranca;

import br.com.glandata.heranca.model.Desenvolvedor;
import br.com.glandata.heranca.model.Gerente;

public class App {
	public static void main(String[] args) {
		float salarioBase = 1500f;

		Desenvolvedor dev = new Desenvolvedor(123, "Asdrubal");
		dev.setAcessaServidor(true);
		dev.setIdade(31);
		dev.setEndereco("Rua dos Bobos, 0");
		dev.setSalario(salarioBase);
		// dev.imprimeNome();
		System.out.println(dev);

		Gerente gerente = new Gerente(456, "Astolfo");
		gerente.setSalario(salarioBase);
		gerente.setAcessoContas(true);
		gerente.setIdade(40);
		gerente.setEndereco("Rua dos Bobos, 2");
		// gerente.imprimeNome();
		System.out.println(gerente);
	}
}
