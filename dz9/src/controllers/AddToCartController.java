package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class AddToCartController {
    private final ShopService shopService;

    public AddToCartController(ShopService shopService) {
        this.shopService = shopService;
    }

    public boolean addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        String productId = scanner.nextLine();
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return shopService.addToCart(productId, count);
    }
}
