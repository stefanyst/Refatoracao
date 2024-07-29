import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
private Date dataEmprestimo;
private Date dataPrevista;
private Date dataAux;
private List<Item> itens;
public Emprestimo(Date dataEmprestimo, Date dataPrevista, Date dataAux,
List<Item> itens) {
this.dataEmprestimo = dataEmprestimo;
this.dataPrevista = dataPrevista;
this.dataAux = dataAux;
this.itens = itens;
}
public Emprestimo() {
this.dataEmprestimo = new Date();
this.dataPrevista = new Date();
this.dataAux = new Date();
this.itens = new ArrayList<>();
}
public Date getDataEmprestimo() {
return this.dataEmprestimo;
}
public void setDataEmprestimo(Date dataEmprestimo) {
this.dataEmprestimo = dataEmprestimo;
}
public Date getDataPrevista() {
return this.dataPrevista;
}
public void setDataPrevista(Date dataPrevista) {
this.dataPrevista = dataPrevista;
}
public List<Item> getItens() {
return this.itens;
}
public void setItens(List<Item> itens) {
this.itens = itens;
}

}