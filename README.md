# Order & Shipping Service

This repository contains the solution for the **Componentes e Injeção de Dependência** challenge from Chapter 1 of the **Java Professional** course by DevSuperior.

## 🎯 Project Objective
The application calculates the total price of an order based on its basic value, discount percentage, and shipping cost. The core focus is demonstrating **Inversion of Control (IoC)** and **Dependency Injection (DI)** using Spring Boot.

## 🛠️ Technologies Used
- **Java 23**
- **Spring Boot 3.5**
- **Maven** (Dependency Management)

## 🏗️ Architecture and Domain Model
The system follows clean code principles and high cohesion by separating responsibilities into specific components:
- `Order`: Domain entity representing the order data.
- `ShippingService`: Component responsible for calculating delivery fees.
- `OrderService`: Component responsible for coordinating the final price calculation.

## 🚀 How to Run the Project
1. Clone this repository:
   ```bash
   git clone <https://github.com/andre3tcss/order-shipping-service>
   ```
2. Open the project in your favorite IDE (IntelliJ IDEA, STS, etc.).
3. Run the application as a Spring Boot App.
4. Check the results printed directly in the terminal console.
