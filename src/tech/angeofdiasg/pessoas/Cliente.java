package tech.angeofdiasg.pessoas;

import java.time.LocalDate;

import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angeofdiasg.composicao.Endereco;

public class Cliente extends Pessoa{
	private String codigo;
	private String Profissao;
	
	public void cadastrar(String codigo, String profissao, 
			String nome, LocalDate dataNascimento, 
			Endereco endereco,ListaDeTelefonesNaoOrdenados listaTelsContato) {
		this.codigo = codigo;
		this.Profissao = profissao;
		cadastrar(nome, dataNascimento, endereco, listaTelsContato);
	}
	
	public void cadastrar(String nome) {
		setNome(nome);
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
