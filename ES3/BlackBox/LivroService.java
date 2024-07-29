public class LivroService extends ProdutoService implements
IProdutoProvider<Livro> {
private Livro livro;
public LivroService(Livro livro) {
this.livro = livro;
}
@Override
public Livro getProduto() {
return livro;
}
@Override
public void setProduto(Livro obj) {
this.livro = obj;
}
@Override
public int verPrazo() {
return this.livro.getTitulo().getPrazo();
}
@Override
public boolean verificaProduto() {
return this.livro.getCodigo() == 3;
}

}