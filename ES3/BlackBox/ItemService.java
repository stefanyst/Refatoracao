public class ItemService {
private Item item;
public ItemService(Item item) {
this.item = item;
}
public Item getItem() {
return this.item;
}
public void setItem(Item item) {
this.item = item;
}
public boolean verificaProduto() {
return !this.item.getTitulo().equals("Indisponível");
}
}


