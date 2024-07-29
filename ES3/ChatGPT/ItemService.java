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
}
public class Leitura {
    private boolean ilustrado;

    public Leitura(boolean ilustrado) {
        this.ilustrado = ilustrado;
    }

    public boolean isIlustrado() {
        return this.ilustrado;
    }

    public void setIlustrado(boolean ilustrado) {
        this.ilustrado = ilustrado;
    }
}

