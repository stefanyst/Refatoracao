import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {

	private Date dataEmprestimo;
	private Date dataPrevista;
	private List<Item> itens;

	public Emprestimo(Date dataEmprestimo, Date dataPrevista, List<Item> itens) {
    	this.dataEmprestimo = dataEmprestimo;
    	this.dataPrevista = dataPrevista;
    	this.itens = itens;
	}

	public Emprestimo() {
    	this(new Date(), new Date(), new ArrayList<>());
	}

	public Date getDataEmprestimo() {
    	return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
    	this.dataEmprestimo = dataEmprestimo;
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

