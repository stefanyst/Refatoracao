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

    @SuppressWarnings("unchecked")
    public void exibirProdutos(List<ProdutoService> produtosServices) {
        List<IProdutoProvider<Produto>> list = new ArrayList<>();
        for (ProdutoService pr : produtosServices) {
            list.add((IProdutoProvider<Produto>) pr);
        }
        System.out.println("Número de livros emprestados: " + produtosServices.size());
        System.out.println("Livros: ");
        for (IProdutoProvider<Produto> produtoService : list) {
            System.out.println(produtoService.getProduto().getTitulo().getNomeTitulo());
        }
    }

    public void emprestar(IUsuarioService usuarioService, List<ProdutoService> livrosService) throws Exception {
        boolean alunoPodeEmprestar = usuarioService.verificaUsuario() && usuarioService.verificaDebito();

        if (!alunoPodeEmprestar) {
            throw new Exception("Aluno não pode emprestar livros");
        }

        List<ProdutoService> verifiedLivrosService = this.verificarLivro(livrosService);

        if (verifiedLivrosService.isEmpty()) {
            throw new Exception("Livro não está disponível no acervo");
        }

        usuarioService.emprestar(verifiedLivrosService);
        this.exibirProdutos(verifiedLivrosService);
    }
}

