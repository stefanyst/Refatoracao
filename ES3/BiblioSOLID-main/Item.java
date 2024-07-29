

import java.util.Date;

import src.abstracts.Produto;

public class Item {

	private Produto produto;
    private Date dataDevolucao;
    
	public Item(Date dataDevolucao, Produto produto) {
		
		this.dataDevolucao = dataDevolucao;
		this.produto = produto;
		
	}


	public Item(Produto produto) {

		this.produto = produto;
		
	}


	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}
