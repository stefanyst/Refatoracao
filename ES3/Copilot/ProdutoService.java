public class ProdutoService implements IProdutoProvider<Produto> {
    private Produto produto;

    public ProdutoService(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean verificaProduto() {
        return this.produto.isIlustrado();
    }
}
