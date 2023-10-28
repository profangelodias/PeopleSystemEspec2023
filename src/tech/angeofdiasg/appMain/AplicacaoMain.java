package tech.angeofdiasg.appMain;

import tech.angeofdiasg.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {

		Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		
		objNovoFunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Dias",
				"18/09/1986", "Aqui", "958959963");
		objNovoCli01.cadastrar("C01", "Lider da Projecta", "Junio", "01/01/1980",
				"Uniesp", "9191981981981981");

	}

}
