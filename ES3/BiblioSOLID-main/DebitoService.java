public class DebitoService {
    
    private Debito debito;

    public DebitoService(Debito debito){
        this.debito = debito;
    }

    public Debito getDebito(){
        return this.debito;
    }

    public void setDebito(Debito debito){
        this.debito = debito;
    }

    public boolean verificaDebito()
	{
	
		if(this.debito.getCodigoAluno() == 4){
            return false;
        }

		return true;
	
	}



}
