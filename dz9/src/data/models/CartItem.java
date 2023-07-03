package data.models;

public class CartItem {
    public final Product product;
    //модель для хранения товаров в корзине
    public final int count;
    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}