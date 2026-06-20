package com.devsuperior.order_shipping_device;

import com.devsuperior.order_shipping_device.entities.Order;
import com.devsuperior.order_shipping_device.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderShippingDeviceApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(OrderShippingDeviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.90, 0.0);
		double totalValue = orderService.total(order);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
