import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class EmprestimoService {
private Emprestimo emprestimo;
private List<ItemService> itensService;
private DevolucaoService devolucaoService;
private Date dataEmprestimo;
private Date dataPrevista;
public EmprestimoService(Emprestimo emprestimo, DevolucaoService
devolucaoService) {
this.emprestimo = emprestimo;
this.dataEmprestimo = new Date();
this.dataPrevista = new Date();
this.devolucaoService = devolucaoService;
}
public EmprestimoService(Emprestimo emprestimo, List<ItemService>
itensService, DevolucaoService devolucaoService) {
this.emprestimo = emprestimo;
this.itensService = itensService;
this.devolucaoService = devolucaoService;
this.dataEmprestimo = new Date();
this.dataPrevista = new Date();
}
public Emprestimo getEmprestimo() {
return this.emprestimo;
}
public void setEmprestimo(Emprestimo emprestimo) {
this.emprestimo = emprestimo;
}
public Date getDataPrevista() {
return this.dataPrevista;
}

public void setDataPrevista(Date dataPrevista) {
this.dataPrevista = dataPrevista;
}
public Date getDataEmprestimo() {
return this.dataEmprestimo;
}
public void setDataEmprestimo(Date dataEmprestimo) {
this.dataEmprestimo = dataEmprestimo;
}
public List<ItemService> getItensService() {
return this.itensService;
}
public void setItensService(List<ItemService> itensService) {
this.itensService = itensService;
}
public DevolucaoService getDevolucaoService() {
return this.devolucaoService;
}
public void setDevolucaoService(DevolucaoService devolucaoService) {
this.devolucaoService = devolucaoService;
}
public boolean emprestar(List<IProdutoProvider<Produto>> produtos) {
List<Item> itens = new ArrayList<>();
for (IProdutoProvider<Produto> produto : produtos) {
Item item = new Item(produto.getProduto().getTitulo(),
produto.getProduto().getAutor());
itens.add(item);
}
this.emprestimo.setItens(itens);
return true;
}
}