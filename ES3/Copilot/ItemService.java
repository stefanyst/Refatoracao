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

