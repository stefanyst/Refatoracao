

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		try {

			Leitura reader = new Leitura();
			reader.readData();
			
			List<ProdutoService> livrosService = new ArrayList<>();
			for(int i=0; i< reader.num; i++){   
				livrosService.add(new LivroService(new Livro(reader.codigos.get(i))));
			}

			Controle c = new Controle();
			IUsuarioService aluno = (IUsuarioService) new Aluno(reader.nomeAluno);
			c.emprestar(
				new AlunoService(
					(Aluno) aluno,
					new EmprestimoService(
						((Aluno) aluno).getEmprestimo(),
					 	new DevolucaoService(
							new Devolucao()
						)
					),
					new DebitoService(((Aluno) aluno).getDebito())
				), 
				livrosService
			);

			
    	 
		} catch (Exception e) {
			
			System.out.println("Erro: "+e.getMessage()+", tente novamente");

		}
		  
	}

}
