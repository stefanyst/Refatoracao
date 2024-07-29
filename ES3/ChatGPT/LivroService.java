public class LivroService extends ProdutoService {
    private Livro livro;

    public LivroService(Livro livro) {
        super(livro);
        this.livro = livro;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
