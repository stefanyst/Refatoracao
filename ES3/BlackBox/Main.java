import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String[] args) {
try {
Leitura reader = new Leitura();
reader.readData();
List<ProdutoService> livrosService = new ArrayList<>();
for (int i = 0; i < reader.getNum(); i++) {
livrosService.add(new LivroService(new

Livro(reader.getCodigos().get(i))));
}
Controle c = new Controle();
IUsuarioService aluno = new Aluno(reader.getNomeAluno());
c.emprestar(
new AlunoService(
(Aluno) aluno,
new EmprestimoService(
((Aluno) aluno).getEmprestimo(),
new DevolucaoService(new Devolucao())
),
new DebitoService(((Aluno) aluno).getDebito())
),
livrosService
);
} catch (Exception e) {
System.out.println("Erro: " + e.getMessage() + ", tente novamente");
}
}
}