package tech.angeofdiasg.appMain;

import java.time.LocalDate;

import tech.angeofdiasg.composicao.Endereco;
import tech.angeofdiasg.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {

		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		Endereco objEndCli01 = new Endereco();
		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
		
		objEndCli01.cadastrarEnd("A rua", "O numero", "o CEP", "A cidade", 
				"O Estado", "O Pais");
//		objNovoFunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Dias",
//				"18/09/1986", "Aqui", "958959963");
		objNovoCli01.cadastrar("C01", "Lider da Projecta", "Junio", LocalDate.of(2000, 12, 1),
				objEndCli01, "9191981981981981");
		
		
		objNovoCli01.getNome();
		objNovoCli01.getCodigo();
		objNovoCli01.getEndereco().getCep();
		objNovoCli01.obterIdade();
		
		
		

	}

}
