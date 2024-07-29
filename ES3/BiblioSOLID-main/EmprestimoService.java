

import java.util.Date;
import java.util.List;

public class EmprestimoService {
    
    private Emprestimo emprestimo;
    private List<ItemService> itensService;
    private DevolucaoService devolucaoService;
    private Date dataEmprestimo;
    private Date dataPrevista;

    public EmprestimoService(Emprestimo emprestimo, DevolucaoService devolucaoService
    ){

        this.emprestimo = emprestimo;
        this.dataEmprestimo = new Date();
        this.dataPrevista = new Date();
        this.devolucaoService = devolucaoService;

    }

    public EmprestimoService(
        Emprestimo emprestimo,
        List<ItemService> itensService,
        DevolucaoService devolucaoService
    ){
        this.emprestimo = emprestimo;
        this.itensService = itensService;
        this.devolucaoService = devolucaoService;
        this.dataEmprestimo = new Date();
        this.dataPrevista = new Date();
    }


    public Emprestimo getEmprestimo(){
        return this.emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public Date getDataPrevista(){
        return this.dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista){
        this.dataPrevista = dataPrevista;
    }

    public Date getDataEmprestimo(){
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public List<ItemService> getItensService(){
        return this.itensService;
    }

    public void setItensService(List<ItemService> itensServices){
        this.itensService = itensServices;
    }

    public DevolucaoService getDevolucaoService(){
        return this.devolucaoService;
    }

    public void setDevolucaoService(DevolucaoService devolucaoService){
        this.devolucaoService = devolucaoService;
    }

    public void printEmprestimo(){
		System.out.print("\nNumero de produtos emprestados: "+ this.itensService.size());
		System.out.print("\nData de Empr�stimo: "+this.dataEmprestimo);
		System.out.print("\nData de Devolu��o: "+this.dataPrevista);
	}
	
    public boolean emprestar(List<IProdutoProvider<Produto>> produtosService) {

		for(IProdutoProvider<Produto> produtoService : produtosService){

			this.itensService.add(
                new ItemService(
					new Item(
						produtoService.getProduto()
					)
				)
            );

		}

        this.setDataPrevista(this.devolucaoService.calculaDataDevolucaoEmprestimo());
        this.printEmprestimo();

		return true;

	}
    
	
}
