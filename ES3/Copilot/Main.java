import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
    	try {
        	Leitura reader = new Leitura();
        	reader.readData();

        	List<ProdutoService> livrosService = new ArrayList<>();
        	for (int i = 0; i < reader.num; i++) {
            	livrosService.add(new LivroService(new Livro(reader.codigos.get(i))));
        	}

        	Aluno aluno = new Aluno(reader.nomeAluno);
        	EmprestimoService emprestimoService = new EmprestimoService(aluno.getEmprestimo());
        	DevolucaoService devolucaoService = new DevolucaoService(new Devolucao());
        	DebitoService debitoService = new DebitoService(aluno.getDebito());

        	AlunoService alunoService = new AlunoService(aluno, emprestimoService, devolucaoService, debitoService);
        	Controle controle = new Controle();
        	controle.emprestar(alunoService, livrosService);

    	} catch (Exception e) {
        	System.out.println("Erro: " + e.getMessage() + ", tente novamente");
    	}
	}
}

abstract class Produto {
	public abstract Titulo getTitulo();
}

abstract class ProdutoService {
	public abstract int verPrazo();
	public abstract boolean verificaProduto();
}

