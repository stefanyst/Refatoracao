import java.util.ArrayList;
import java.util.List;

public class Controle {

	public List<ProdutoService> verificarLivro(List<ProdutoService> livrosService) {
    	List<ProdutoService> addedLivrosService = new ArrayList<>();
    	for (ProdutoService livroService : livrosService) {
        	if (!livroService.verificaProduto()) {
            	addedLivrosService.add(livroService);
        	}
    	}
    	return addedLivrosService;
	}

	public void exibirProdutos(List<ProdutoService> produtosServices) {
    	System.out.println("Número de livros emprestados: " + produtosServices.size());
    	System.out.println("Livros: ");
    	for (ProdutoService produtoService : produtosServices) {
        	System.out.println(produtoService.getProduto().getTitulo().getNomeTitulo());
    	}
	}

	public void emprestar(IUsuarioService usuarioService, List<ProdutoService> livrosService) throws Exception {
    	boolean alunoPodeEmprestar = usuarioService.verificaUsuário() && usuarioService.verificaDebito();
    	if (!alunoPodeEmprestar) {
        	throw new Exception("Aluno não pode emprestar livros");
    	}
    	List<ProdutoService> verifiedLivrosService = verificarLivro(livrosService);
    	if (verifiedLivrosService.isEmpty()) {
        	throw new Exception("Livro não está disponível no acervo");
    	}
    	usuarioService.emprestar(verifiedLivrosService);
    	exibirProdutos(verifiedLivrosService);
	}
}
