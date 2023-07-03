package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class AddToCartController {
    //контроллер добавления в корзину
    private final ShopService shopService;

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    //показ добавления товара в корзину
    public boolean addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        //считывание id
        String productId = scanner.nextLine();
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return shopService.addToCart(productId, count);
    }
}
