package tech.angeofdiasg.composicao;

public class Telefone {
	private String ddd;
	private String telefone;
	
	public Telefone(String ddd, String telefone) {
		this.ddd = ddd;
		this.telefone = telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	@Override
	// O toString é executado de forma automática
	//ao tentar imprimir o objeto 
	//(que está sendo feito no exibirTelefones na lista) 
	public String toString() {
		return "("+ ddd +") " + telefone;
	}
	
}
