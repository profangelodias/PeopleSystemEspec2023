package tech.angeofdiasg.appMain;

import java.time.LocalDate;

import tech.angeofdiasg.composicao.Endereco;
import tech.angeofdiasg.composicao.Telefone;
import tech.angeofdiasg.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.angeofdiasg.pessoas.*;

public class AplicacaoMain {

	public static void main(String[] args) {

//		Funcionario objNovoFunc01 = new Funcionario();
//		Cliente objNovoCli01 = new Cliente();
//		Endereco objEndCli01 = new Endereco();
//		LocalDate dataNasc01 = LocalDate.of(2000, 12, 1);
//		
//		objEndCli01.cadastrarEnd("A rua", "O numero", "o CEP", "A cidade", 
//				"O Estado", "O Pais");
////		objNovoFunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Dias",
////				"18/09/1986", "Aqui", "958959963");
//		objNovoCli01.cadastrar("C01", "Lider da Projecta", "Junio", LocalDate.of(2000, 12, 1),
//				objEndCli01, "9191981981981981");
//		
//		
//		objNovo	Cli01.getNome();
//		objNovoCli01.getCodigo();
//		objNovoCli01.getEndereco().getCep();
//		objNovoCli01.obterIdade();
		
		ListaDeTelefonesNaoOrdenados minhaLista = 
				new ListaDeTelefonesNaoOrdenados();
        Telefone telefone1 = new Telefone("11", "1234-5678");
        Telefone telefone2 = new Telefone("22", "9876-5432");
        Telefone telefone3 = new Telefone("33", "5555-1234");
		
		minhaLista.addTelefoneNoSQL(telefone1);
        minhaLista.addTelefoneNoSQL(telefone2);
        minhaLista.addTelefoneNoSQL(telefone3);
		minhaLista.addTelefoneNoSQL(telefone1);
        minhaLista.addTelefoneNoSQL(telefone2);
        minhaLista.addTelefoneNoSQL(telefone3);

        System.out.println("Telefones antes da remoção:");
        minhaLista.exibirTelefones();

        // Remover o telefone2
        minhaLista.removerTelefone(telefone2);

        System.out.println("\nTelefones após a remoção:");
        minhaLista.exibirTelefones();
        
        // Exibe os telefones se a lista não estiver vazia
        if (!minhaLista.isEmpty()) {
            System.out.println("Telefones na lista:");
            minhaLista.exibirTelefones();
        } else {
            System.out.println("A lista de telefones está vazia.");
        }
		
		

	}

}
