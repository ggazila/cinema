package mate.academy.cinema.service;

import java.util.List;

import mate.academy.cinema.model.Order;
import mate.academy.cinema.model.User;

public interface OrderService {
    Order completeOrder(User user);

    List<Order> getOrderHistory(User user);

    Order getById(Long id);
}
