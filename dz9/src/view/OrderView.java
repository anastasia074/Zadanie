package view;

import controllers.OrderController;
import data.service.ShopService;

import java.util.ArrayList;

public class OrderView extends AppView{
    //отображение заказов
    public final ShopService shopService;
    public OrderView(ShopService shopService) {
        super("Ordering", new ArrayList<>());
        this.shopService = shopService;
    }

    //вывод заказов
    @Override
    public void action() {
        OrderController orderController = new OrderController(shopService);
        if (orderController.createOrder()) {
            System.out.println("Successful ordering!");
        } else {
            System.out.println("Ordering failed!");
        }
    }
}
