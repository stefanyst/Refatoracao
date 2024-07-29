import java.util.List;
import src.abstracts.Produto;
import src.abstracts.ProdutoService;
public interface IUsuarioService {
boolean verificaUsuario();
boolean verificaDebito();
boolean emprestar(List<ProdutoService> produtos);
}