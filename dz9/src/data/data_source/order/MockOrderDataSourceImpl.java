package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource {
    //тестовый источник данных заказов
    private Order order;

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    //создание заказа
    public void createOrder(Order order) {
        this.order = order;
    }
}
