package tech.angeofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;

import tech.angeofdiasg.composicao.Endereco;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private String telsContato;
	
	public void cadastrar(String nome, LocalDate dataNascimento, 
			Endereco endereco,String telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
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
	public String getTelsContato() {
		return telsContato;
	}
	public void setTelsContato(String telsContato) {
		this.telsContato = telsContato;
	}
	
	

}






