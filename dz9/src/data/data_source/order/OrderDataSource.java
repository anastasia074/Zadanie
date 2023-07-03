package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {
    //источник данных заказов
    public abstract Order getOrder();
    public abstract void createOrder(Order order);
}
