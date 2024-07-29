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