package data.service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSoure;
import data.data_source.order.OrderDataSource;
import data.models.CartItem;
import data.models.Order;
import data.models.Product;

import java.util.ArrayList;

public class ShopService {
    //сервис, который работает, хранит и управляет всеми данными
    final CatalogDataSoure catalogDataSoure;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSoure catalogDataSoure, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSoure = catalogDataSoure;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    //хранилище данных
    public ArrayList<Product> getCatalog() {
        return catalogDataSoure.getCatalog();
    }

    public ArrayList<CartItem> getCart() {
        return cartDataSource.getCart();
    }

    //добавление товаров
    public boolean addToCart(String productId, int count) {
        ArrayList<Product> catalog = getCatalog();
        for(Product p : catalog) {
            if (p.equals(productId) && p.available) {
                cartDataSource.addToCart(p, count);
                return true;
            }
        }
        return false;
    }
    //формирование заказов
    public boolean createOrder(String name, String phone, String address, String paymentType, String deliveryTime) {
        ArrayList<CartItem> cart = getCart();
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);
        return true;
    }
}
