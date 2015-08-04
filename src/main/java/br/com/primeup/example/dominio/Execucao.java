package br.com.primeup.example.dominio;

import br.com.primeup.example.dominio.Cliente;
import br.com.primeup.example.dominio.TipoDeInstituicao;

public class Execucao {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Cliente", TipoDeInstituicao.PRIVADA);
		String nomeCompleto = cliente.obterNomeCompleto();
		
		System.out.println("IMPRIMINDO!!1!11!!\n" + nomeCompleto);
	}
}
