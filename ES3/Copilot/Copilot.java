public class Aluno {
private String RA;
private String nome;
private Emprestimo emprestimo;
private Debito debito;
public Aluno(String nome) {
this.nome = nome;
}
public Aluno(String RA, String nome, Debito debito, Emprestimo emprestimo)
{
this.RA = RA;

this.nome = nome;
this.debito = debito;
this.emprestimo = emprestimo;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public String getRA() {
return RA;
}
public void setRA(String RA) {
this.RA = RA;
}
public Debito getDebito() {
return debito;
}
public void setDebito(Debito debito) {
this.debito = debito;
}
public Emprestimo getEmprestimo() {
return emprestimo;
}
public void setEmprestimo(Emprestimo emprestimo) {
this.emprestimo = emprestimo;
}
}


import java.util.List;
public class AlunoService implements IUsuarioService {

private Aluno aluno;
private EmprestimoService emprestimoService;
private DebitoService debitoService;
public AlunoService(Aluno aluno) {
this.aluno = aluno;
}
public AlunoService(Aluno aluno, EmprestimoService emprestimoService,
DebitoService debitoService) {
this.aluno = aluno;
this.emprestimoService = emprestimoService;
this.debitoService = debitoService;
}
public Aluno getAluno() {
return aluno;
}
public void setAluno(Aluno aluno) {
this.aluno = aluno;
}
public EmprestimoService getEmprestimoService() {
return emprestimoService;
}
public void setEmprestimoService(EmprestimoService emprestimoService) {
this.emprestimoService = emprestimoService;
}
public DebitoService getDebitoService() {
return debitoService;
}
public void setDebitoService(DebitoService debitoService) {
this.debitoService = debitoService;
}
public boolean verificaUsuário() {
return !this.aluno.getRA().equals("10");
}

public boolean verificaDebito() {
return this.debitoService.verificaDebito();
}
public boolean emprestar(List<ProdutoService> produtos) {
List<IProdutoProvider<Produto>> list = new ArrayList<>();
for (ProdutoService pr : produtos) {
list.add((IProdutoProvider<Produto>) pr);
}
return this.emprestimoService.emprestar(list);
}
}


import java.util.ArrayList;
import java.util.List;
public class Controle {
public List<ProdutoService> verificarLivro(List<ProdutoService> livrosService)
{
List<ProdutoService> addedLivrosService = new ArrayList<>();
for (ProdutoService livroService : livrosService) {
if (!livroService.verificaProduto()) {
addedLivrosService.add(livroService);
}
}
return addedLivrosService;
}
public void exibirProdutos(List<ProdutoService> produtosServices) {
System.out.println("Número de livros emprestados: " +
produtosServices.size());
System.out.println("Livros: ");
for (ProdutoService produtoService : produtosServices) {
System.out.println(produtoService.getProduto().getTitulo().getNomeTitulo());
}
}
public void emprestar(IUsuarioService usuarioService, List<ProdutoService>
livrosService) throws Exception {
boolean alunoPodeEmprestar = usuarioService.verificaUsuário() &&
usuarioService.verificaDebito();

if (!alunoPodeEmprestar) {
throw new Exception("Aluno não pode emprestar livros");
}
List<ProdutoService> verifiedLivrosService = verificarLivro(livrosService);
if (verifiedLivrosService.isEmpty()) {
throw new Exception("Livro não está disponível no acervo");
}
usuarioService.emprestar(verifiedLivrosService);
exibirProdutos(verifiedLivrosService);
}
}


public class Debito {
private int codigoAluno;
public Debito(int aluno) {
this.codigoAluno = aluno;
}
public Integer getCodigoAluno() {
return this.codigoAluno;
}
public void setCodigoAluno(Integer codigoAluno) {
this.codigoAluno = codigoAluno;
}
}
public class DebitoService {
private Debito debito;
public DebitoService(Debito debito) {
this.debito = debito;
}
public Debito getDebito() {
return this.debito;
}
public void setDebito(Debito debito) {
this.debito = debito;
}

public boolean verificaDebito() {
return this.debito.getCodigoAluno() != 4;
}
}
—------------------------------------
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Devolucao {
private Date dataPrevista;
private Date dataAux;
private List<Item> itens;
public Devolucao(Date dataPrevista, Date dataAux, List<Item> itens) {
this.dataPrevista = dataPrevista;
this.dataAux = dataAux;
this.itens = itens;
}
public Devolucao() {
this.dataPrevista = new Date();
this.dataAux = new Date();
this.itens = new ArrayList<>();
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

—----------------------------------
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Emprestimo {
private Date dataEmprestimo;
private Date dataPrevista;
private List<Item> itens;
public Emprestimo(Date dataEmprestimo, Date dataPrevista, List<Item>
itens) {
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
—-----------------------------
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
// Getters and setters...
public void printEmprestimo() {
System.out.print("\nNúmero de produtos emprestados: " +
this.itensService.size());
System.out.print("\nData de Empréstimo: " + this.dataEmprestimo);
System.out.print("\nData de Devolução: " + this.dataPrevista);
}
public boolean emprestar(List<IProdutoProvider<Produto>> produtosService)
{

for (IProdutoProvider<Produto> produtoService : produtosService) {
this.itensService.add(new ItemService(new
Item(produtoService.getProduto())));
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
—----------------------------------
import java.util.Date;
public class Item {
private Produto produto;
private Date dataDevolucao;
public Item(Produto produto, Date dataDevolucao) {
this.produto = produto;
this.dataDevolucao = dataDevolucao;
}
public Item(Produto produto) {
this(produto, null);
}
public Date getDataDevolucao() {
return dataDevolucao;
}
public void setDataDevolucao(Date dataDevolucao) {

this.dataDevolucao = dataDevolucao;
}
public Produto getProduto() {
return produto;
}
public void setProduto(Produto produto) {
this.produto = produto;
}
}
public class ItemService {
private Item item;
private ProdutoService produtoService;
public ItemService(Item item) {
this.item = item;
}
public ItemService(Item item, ProdutoService produtoService) {
this.item = item;
this.produtoService = produtoService;
}
public Item getItem() {
return item;
}
public void setItem(Item item) {
this.item = item;
}
public ProdutoService getProdutoService() {
return produtoService;
}
public void setProdutoService(ProdutoService produtoService) {
this.produtoService = produtoService;
}
}
—----------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leitura {
private Scanner entrada;
private String nomeAluno;
private int num;
private List<Integer> codigos;
public Leitura() {
this.entrada = new Scanner(System.in);
this.codigos = new ArrayList<>();
}
public void readData() {
System.out.print("Digite o RA do Aluno: ");
this.nomeAluno = entrada.nextLine();
System.out.print("Digite o número de Livros a ser Emprestado: ");
this.num = entrada.nextInt();
int aux;
for (int i = 0; i < num; i++) {
System.out.print("Digite o código do livro " + (i + 1) + ": ");
aux = this.entrada.nextInt();
this.codigos.add(aux);
}
}
// Getters and setters...
}
public class Livro extends Produto {
private Titulo titulo;
private int codigo;
public Livro(int codigo) {
this.codigo = codigo;
}
public Livro(int codigo, Titulo titulo) {
this.titulo = titulo;
this.codigo = codigo;

}
public Titulo getTitulo() {
return this.titulo;
}
public void setTitulo(Titulo titulo) {
this.titulo = titulo;
}
public Integer getCodigo() {
return this.codigo;
}
public void setCodigo(Integer codigo) {
this.codigo = codigo;
}
}
public class LivroService extends ProdutoService implements
IProdutoProvider<Livro> {
private Livro livro;
public LivroService(Livro livro) {
this.livro = livro;
}
public Livro getProduto() {
return this.livro;
}
public void setProduto(Livro obj) {
this.livro = obj;
}
public int verPrazo() {
return this.livro.getTitulo().getPrazo();
}
public boolean verificaProduto() {
return this.livro.getCodigo() == 3;
}
}

—--------------------------------
import java.util.ArrayList;
import java.util.List;
public class Main {
public static void main(String[] args) {
try {
Leitura reader = new Leitura();
reader.readData();
List<ProdutoService> livrosService = new ArrayList<>();
for (int i = 0; i < reader.num; i++) {
livrosService.add(new LivroService(new Livro(reader.codigos.get(i))));
}
Aluno aluno = new Aluno(reader.nomeAluno);
EmprestimoService emprestimoService = new
EmprestimoService(aluno.getEmprestimo());
DevolucaoService devolucaoService = new DevolucaoService(new
Devolucao());
DebitoService debitoService = new DebitoService(aluno.getDebito());
AlunoService alunoService = new AlunoService(aluno, emprestimoService,
devolucaoService, debitoService);
Controle controle = new Controle();
controle.emprestar(alunoService, livrosService);
} catch (Exception e) {
System.out.println("Erro: " + e.getMessage() + ", tente novamente");
}
}
}
abstract class Produto {
public abstract Titulo getTitulo();
}
abstract class ProdutoService {
public abstract int verPrazo();
public abstract boolean verificaProduto();
}

class Titulo {
private int codigo;
private String nomeTitulo;
private int prazo;
public Titulo(int codigo) {
this.codigo = codigo;
this.prazo = codigo + 1;
}
public Titulo(int codigo, String nomeTitulo) {
this.codigo = codigo;
this.prazo = codigo + 1;
this.nomeTitulo = nomeTitulo;
}
public Titulo(String nomeTitulo) {
this.nomeTitulo = nomeTitulo;
}
public int getPrazo() {
return this.prazo;
}
public void setPrazo(int prazo) {
this.prazo = prazo;
}
public int getCodigo() {
return this.codigo;
}
public void setCodigo(int codigo) {
this.codigo = codigo;
}
public String getNomeTitulo() {
return this.nomeTitulo;
}
public void setNomeTitulo(String nomeTitulo) {
this.nomeTitulo = nomeTitulo;
}
}
