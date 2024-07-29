



public class LivroService extends ProdutoService implements IProdutoProvider<Livro>{

    private Livro livro;

    public LivroService(Livro livro){
        this.livro = livro;
    }

    public Livro getProduto(){
        return this.livro;
    }

    public void setProduto(Livro obj){
        this.livro = obj;
    }

    public int verPrazo() {

		return this.livro.getTitulo().getPrazo();

	}
	
	public boolean verificaProduto() {

		if (this.livro.getCodigo() == 3){
			
			return true;

		}
		return false;

	}

    
}