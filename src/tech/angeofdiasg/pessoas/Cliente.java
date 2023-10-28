package tech.angeofdiasg.pessoas;

import tech.angeofdiasg.composicao.Endereco;

public class Cliente extends Pessoa{
	private String codigo;
	private String Profissao;
	
	public void cadastrar(String codigo, String profissao, 
			String nome, String dataNascimento, 
			Endereco endereco,String telsContato) {
		this.codigo = codigo;
		this.Profissao = profissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

}
