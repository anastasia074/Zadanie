package view;

import data.models.CartItem;
import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView{
    //отображение корзины
    public final ShopService shopService;
    public CartView(ShopService shopService) {
        super("Cart", new ArrayList<>());
        this.shopService = shopService;
    }

    //вывод корзины
    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
        for (CartItem item : cart) {
            System.out.println(item.count + " - " + item.product.title);
        }
        System.out.println();
    }
}
