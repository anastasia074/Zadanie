package data.models;


import java.util.ArrayList;

public class Order {
    //модель для хранения заказов
    public final String name;
    public final String phone;
    public final String address;
    public final String paymentType;
    public final String deliveryTime;
    public final ArrayList<CartItem> cart;

    //ввод данных с клавиатуры для сохранения заказов
    public Order(String name, String phone, String address, String paymentType, String deliveryTime,ArrayList<CartItem> cart) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
    }
}
