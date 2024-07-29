import java.util.Date;
import java.util.List;

public class EmprestimoService {
    
	private Emprestimo emprestimo;
	private List<ItemService> itensService;
	private DevolucaoService devolucaoService;
	private Date dataEmprestimo;
	private Date dataPrevista;

	public EmprestimoService(Emprestimo emprestimo, DevolucaoService devolucaoService) {
    	this.emprestimo = emprestimo;
    	this.dataEmprestimo = new Date();
    	this.dataPrevista = new Date();
    	this.devolucaoService = devolucaoService;
	}

	public EmprestimoService(Emprestimo emprestimo, List<ItemService> itensService, DevolucaoService devolucaoService) {
    	this.emprestimo = emprestimo;
    	this.itensService = itensService;
    	this.devolucaoService = devolucaoService;
    	this.dataEmprestimo = new Date();
    	this.dataPrevista = new Date();
	}

	// Getters and setters...

	public void printEmprestimo() {
    	System.out.print("\nNúmero de produtos emprestados: " + this.itensService.size());
    	System.out.print("\nData de Empréstimo: " + this.dataEmprestimo);
    	System.out.print("\nData de Devolução: " + this.dataPrevista);
	}

	public boolean emprestar(List<IProdutoProvider<Produto>> produtosService) {
    	for (IProdutoProvider<Produto> produtoService : produtosService) {
        	this.itensService.add(new ItemService(new Item(produtoService.getProduto())));
    	}
    	this.setDataPrevista(this.devolucaoService.calculaDataDevolucaoEmprestimo());
    	this.printEmprestimo();
    	return true;
	}
}

public interface IProdutoProvider<T> {
	T getProduto();
	void setProduto(T obj);
}

public interface IUsuarioService {
	boolean verificaUsuário();
	boolean verificaDebito();
	boolean emprestar(List<ProdutoService> livros);
}
