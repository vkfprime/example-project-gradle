package br.com.primeup.example.dominio;


public class Cliente {
	
	private String nome;
	private TipoDeInstituicao Tipo;
	
	public Cliente(String nome, TipoDeInstituicao tipoDeInst) {
		super();
		this.nome = nome;
		Tipo = tipoDeInst;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoDeInstituicao getTipoDeInst() {
		return Tipo;
	}
	public void setTipoDeInst(TipoDeInstituicao tipoDeInst) {
		Tipo = tipoDeInst;
	}

    public String obterNomeCompleto() {

        String result = nome.concat(Tipo.toString());
        return result;
     

    }
}
