package tech.angelofdiasg.estruturas;

import java.util.Iterator;

import tech.angeofdiasg.composicao.Telefone;

public class ListaDeTelefonesNaoOrdenados {
	//Vetor de telefones onde criaremos nossa lista
	private Telefone[] telefones;
	//controle do tamanho
	private int tamanho;
	//Capacidade inicial (pode ser alterada depois)
	private static final int CAPACIDADE_PADRAO = 3;
	
	//Construtor da lista
	public ListaDeTelefonesNaoOrdenados() {
		this.telefones = new Telefone[CAPACIDADE_PADRAO];
		this.tamanho = 0;
	}
	
	//Verificador de vazio
	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
	private void garantirCapacidade() {
			int novaCapacidade = telefones.length * 2;
			Telefone[] listaTelefones = new Telefone[novaCapacidade];
			for(int i = 0; i < tamanho; i++) {
				listaTelefones[i] = telefones[i];
			}
			telefones = listaTelefones;
	}
	//Adicionar um telefone VIDA LOKA
	public void addTelefoneNoSQL(Telefone telefone) {
		//length ele pega a capacidade atual em tempo de execu��o,
		//Caso a CAPACIDADE_PADRAO seja alterada.
		if (tamanho == telefones.length) {
			//Se o veotr estiver cheio, aumente sua capacidade
			garantirCapacidade();
		}
		telefones[tamanho] = telefone;
		this.tamanho = tamanho +1;
	}
	
	//Adicionar um telefone
	public void addTelefone(Telefone telefone) {
		//length ele pega a capacidade atual em tempo de execu��o,
		//Caso a CAPACIDADE_PADRAO seja alterada.
		if (tamanho < telefones.length) {
			//o tamanho j� � o "index + 1", portando iremos usar o tamanho para adicionar, de pois incrementar o tamanho
			telefones[tamanho] = telefone;
			//incremento do tamanho
			this.tamanho = tamanho + 1;
		} else {
			System.out.println("N�o h� mais espa�o para adicionar o " + telefone);
		}
	}
	
	//remover o telefone precisa buscar o index
	public void removerTelefone(Telefone telefone) {
		//Pegar o index do telefone desejado
		int index  = buscarTelefoneIndex(telefone);
		//validar se foi encontrado ou n�o, se foi encontrado o index ser� diferente de -1
		if(index != -1) {
			for (int i = index; i < tamanho - 1; i++) {
				telefones[i] = telefones[i + 1];
		}
		//Pega o �ltimo elemento e coloca null nele, 
		//como tamb�m decrementa o tamanho (--tamanho � o mesmo que tamanho -1)
		this.tamanho = tamanho - 1;
			telefones[tamanho] = null;
	}
	}
	
	//Procura o index do telefone
	private int  buscarTelefoneIndex(Telefone telefone) {
		for(int i = 0; i < tamanho; i++) {
			//valida se os telefones s�o iguais
			if(telefones[i].equals(telefone)) {
				//retorna o index se encontrar
				return i;
			}
		}
		//retorna -1 se n�o encontrar
		System.out.println("Telefone n�o encontrado!");
		return -1;
	}
	
	//imprime os objetos, que n�s colocamos o "toString" l� na classe Telefone
	public void exibirTelefones() {	
		//CRIE: a valida��o de vazio, se tiver vazio, nem entre no "for"
		for(int i = 0; i < tamanho; i++) {
			System.out.println(telefones[i]);
		}
	}

}
