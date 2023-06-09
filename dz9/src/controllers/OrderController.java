package controllers;

import data.service.ShopService;

import java.util.Scanner;

public class OrderController {
    //контроллер заказа
    public final ShopService shopService;

    public OrderController(ShopService shopService) {
        this.shopService = shopService;
    }

    //запрос информации от пользователя
    public boolean createOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone: ");
        String phone = scanner.nextLine();
        return shopService.createOrder(name, phone, "address", "МИР", "22:00");
    }
}
