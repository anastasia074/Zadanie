package controllers;

import data.service.ShopService;
import view.AppView;

import java.util.Scanner;

public class ShopController {
    //связывает пользователя с отображением и с данными
    final AppView view;
    public final ShopService shopService;

    public ShopController(AppView view, ShopService shopService) {
        this.view = view;
        this.shopService = shopService;
    }

    //запуск магазина, принятие данных от пользователя
    public void run() {
        while (true) {
            view.action();
            if (view.children.size() == 0) break;
            view.displayChildren();
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value < 0 && value > view.children.size() + 1) {
                System.out.println("Wrong value!");
            } else if (value == view.children.size() + 1) {
                break;
            } else {
                new ShopController(view.children.get(value - 1), shopService).run();
            }
        }
    }
}
