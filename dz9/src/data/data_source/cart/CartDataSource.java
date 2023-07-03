package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {
    //источник данных корзины
    public abstract ArrayList<CartItem> getCart();
    public abstract void addToCart(Product product, int count);
}
