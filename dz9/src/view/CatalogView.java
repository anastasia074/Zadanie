package view;

import data.models.Product;
import data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {
    //отображение каталога
    //поле передачи
    final ShopService shopService;
    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Catalog", children);
        this.shopService = shopService;
    }

    //вывод каталога
    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product p : catalog) {
            System.out.println(p.id + " " + p.title + " " + p.price);
        }
        System.out.println();
    }
}
