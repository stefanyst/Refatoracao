import java.util.List;

public interface IUsuarioService {
    boolean verificaUsuario();

    boolean verificaDebito();

    boolean emprestar(List<ProdutoService> produtos);
}

