package tech.angeofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import tech.angelofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angeofdiasg.composicao.Endereco;
import tech.angeofdiasg.composicao.Telefone;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private ListaDeTelefonesNaoOrdenados listaTelsContato;
	
	public void cadastrar(String nome, LocalDate dataNascimento, 
			Endereco endereco,ListaDeTelefonesNaoOrdenados listaTelsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.listaTelsContato = listaTelsContato;
	}
	
	public int obterIdade() {
		int idade = 0;
		//subtrair data atual do data de nascimento
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return idade = periodo.getYears();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public ListaDeTelefonesNaoOrdenados getTelsContato() {
		return listaTelsContato;
	}
	public void setTelsContato(ListaDeTelefonesNaoOrdenados telsContato) {
		this.listaTelsContato = telsContato;
	}
	
	

}






