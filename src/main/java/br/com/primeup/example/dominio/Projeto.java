package br.com.primeup.example.dominio;

public class Projeto {
	
	private String nome;
	private String id;
	private Cliente cliente;
	
	public Projeto(String nome, String id, Cliente cliente) {
		super();
		this.nome = nome;
		this.id = id;
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
