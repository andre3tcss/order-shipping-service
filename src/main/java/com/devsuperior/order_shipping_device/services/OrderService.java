package com.devsuperior.order_shipping_device.services;

import com.devsuperior.order_shipping_device.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total (Order order) {

        double discountAmount = order.getBasic() * (order.getDiscount() / 100.0);
        double netBasicValue = order.getBasic() - discountAmount;
        double shippingValue = shippingService.shipment(order);

        return shippingValue + netBasicValue;
    }
}
