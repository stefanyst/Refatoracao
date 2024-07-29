import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Devolucao {
	private Date dataPrevista;
	private Date dataAux;
	private List<Item> itens;

	public Devolucao(Date dataPrevista, Date dataAux, List<Item> itens) {
    	this.dataPrevista = dataPrevista;
    	this.dataAux = dataAux;
    	this.itens = itens;
	}

	public Devolucao() {
    	this.dataPrevista = new Date();
    	this.dataAux = new Date();
    	this.itens = new ArrayList<>();
	}

	public Date getDataPrevista() {
    	return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
    	this.dataPrevista = dataPrevista;
	}

	public List<Item> getItens() {
    	return itens;
	}

	public void setItens(List<Item> itens) {
    	this.itens = itens;
	}
}
