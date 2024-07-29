
import java.util.ArrayList;
import java.util.List;

public class AlunoService implements IUsuarioService{

    private Aluno aluno;
    private EmprestimoService emprestimoService;
    private DebitoService debitoService;
    
    public AlunoService(Aluno aluno){
        this.aluno = aluno;
    }

    public AlunoService(Aluno aluno, EmprestimoService emprestimoService){
        this.aluno = aluno;
        this.emprestimoService = emprestimoService;
    }

    public AlunoService(Aluno aluno, DebitoService debitoService){
        this.aluno = aluno;
        this.debitoService = debitoService;
    }

    public AlunoService(
    Aluno aluno,
    EmprestimoService emprestimoService,
    DebitoService debitoService
    ){
        this.aluno = aluno;
        this.emprestimoService = emprestimoService;
        this.debitoService = debitoService;
    }

    public Aluno getAluno(){
        return this.aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public EmprestimoService getEmprestimoService(){
        return this.emprestimoService;
    }

    public void setEmprestimoService(EmprestimoService emprestimoService){
        this.emprestimoService = emprestimoService;
    }

    public DebitoService getDebitoService(){
        return this.debitoService;
    }

    public void setDebitoService(DebitoService debitoService){
        this.debitoService = debitoService;
    }

    public boolean verificaUsuário(){   

		if(this.aluno.getRA().equals("10")){
            return false;
        }
        return true;
    }

    public boolean verificaDebito(){       
         
		return this.debitoService.verificaDebito();
		
	}

    @SuppressWarnings("unchecked")
    public boolean emprestar(List<ProdutoService> produtos){   
        
 		List<IProdutoProvider<Produto>> list = new ArrayList<>();
		for(ProdutoService pr : produtos ){
			list.add((IProdutoProvider<Produto>) pr);
		}
        return this.emprestimoService.emprestar(list);

	}
    
}