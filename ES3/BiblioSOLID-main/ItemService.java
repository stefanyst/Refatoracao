

public class ItemService {

    private Item item;
    private ProdutoService produtoService;

    public ItemService(Item item){
        this.item = item;
    }
    public ItemService(Item item, ProdutoService produtoService){
        this.produtoService = produtoService;
        this.item = item;
    }

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public ProdutoService getProdutoService(){
        return this.produtoService;
    }

    public void setProdutoService(ProdutoService produtoService){
        this.produtoService = produtoService;
    }


}
