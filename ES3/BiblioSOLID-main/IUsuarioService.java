

import java.util.List;

import src.abstracts.ProdutoService;


public interface IUsuarioService {
    
    public boolean verificaUsuário();
    public boolean verificaDebito();
    public boolean emprestar(List<ProdutoService> livros);

}
