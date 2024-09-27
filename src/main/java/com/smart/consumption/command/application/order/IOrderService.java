package com.smart.consumption.command.application.order;

import com.smart.consumption.command.domain.models.order.Order;

public interface IOrderService {
    Order save(Order order);
}
