public class DevolucaoService {
private Devolucao devolucao;
public DevolucaoService(Devolucao devolucao) {
this.devolucao = devolucao;
}
public Devolucao getDevolucao() {
return this.devolucao;
}
public void setDevolucao(Devolucao devolucao) {
this.devolucao = devolucao;
}
}