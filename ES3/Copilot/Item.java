import java.util.Date;

public class Item {

	private Produto produto;
	private Date dataDevolucao;

	public Item(Produto produto, Date dataDevolucao) {
    	this.produto = produto;
    	this.dataDevolucao = dataDevolucao;
	}

	public Item(Produto produto) {
    	this(produto, null);
	}

	public Date getDataDevolucao() {
    	return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
    	this.dataDevolucao = dataDevolucao;
	}

	public Produto getProduto() {
    	return produto;
	}

	public void setProduto(Produto produto) {
    	this.produto = produto;
	}
}

