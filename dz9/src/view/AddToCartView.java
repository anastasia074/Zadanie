package view;

import controllers.AddToCartController;
import data.service.ShopService;

import java.util.ArrayList;

public class AddToCartView extends AppView {
    //вызывается какой-либо контроллер
final ShopService shopService;
    public AddToCartView(ShopService shopService) {
        super("AddToCart", new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public void action() {
        AddToCartController addToCartController = new AddToCartController(shopService);
            if (addToCartController.addToCart()) {
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }
    }
}
