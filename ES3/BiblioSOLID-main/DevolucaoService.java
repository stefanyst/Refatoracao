

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DevolucaoService {
    private Devolucao devolucao;
    private List<ItemService> itensService;
    private Date dataPrevista;

    public DevolucaoService(Devolucao devolucao){
        this.devolucao = devolucao;
        this.dataPrevista = new Date();
    }

    public DevolucaoService(Devolucao devolucao, List<ItemService> itensService){
        this.devolucao = devolucao;
        this.itensService = itensService;
        this.dataPrevista = new Date();
    }


    public Devolucao getDevolucao(){
        return this.devolucao;
    }

    public void setDevolucao(Devolucao devolucao){
        this.devolucao = devolucao;
    }

    public Date getDataPrevista(){
        return this.dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista){
        this.dataPrevista = dataPrevista;
    }

    public List<ItemService> getItensService(){
        return this.itensService;
    }

    public void setItensService(List<ItemService> itensServices){
        this.itensService = itensServices;
    }

    private Date calculaDataDevolucaoItem(Date data, int prazo){

	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(data);
	    calendar.add(Calendar.DATE, prazo);

        return calendar.getTime();

	}
    
	public Date calculaDataDevolucaoEmprestimo(){   
        
		Date date = new Date();
        Date dataAux = new Date();
		for(ItemService item : this.itensService){

            dataAux = this.calculaDataDevolucaoItem(date, item.getProdutoService().verPrazo());

		    if(this.dataPrevista.compareTo(dataAux) < 0){

                this.setDataPrevista(date);

            }
		 	  
        }
        
        int size = itensService.size();
        if(size > 2){

            this.setDataPrevista(adicionalData(size-2));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.dataPrevista);
            calendar.add(Calendar.DATE, ((size-2)*2));
            this.setDataPrevista(calendar.getTime());

        }

        for(ItemService item : this.itensService){

            item.getItem().setDataDevolucao(this.dataPrevista);
		 	  
        }

		
		return this.devolucao.getDataPrevista();
	
	}


    public Date adicionalData(int tam){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrevista);
        calendar.add(Calendar.DATE, (tam*2));
        return calendar.getTime();

    }
	

}
