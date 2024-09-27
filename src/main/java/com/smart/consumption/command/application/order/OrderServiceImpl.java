package com.smart.consumption.command.application.order;

import org.springframework.stereotype.Service;

import com.smart.consumption.command.domain.models.order.IOrderRepository;
import com.smart.consumption.command.domain.models.order.Order;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements IOrderService {

    private final IOrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
    
}
