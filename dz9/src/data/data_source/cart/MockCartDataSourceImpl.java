package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource {
    //тестовый источник данных корзины
    private ArrayList<CartItem> cart = new ArrayList<>();
    @Override
    //вывод корзины
    public ArrayList<CartItem> getCart() {
        return cart;
    }

    @Override
    //добавление в корзину
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product,count));
    }
}
