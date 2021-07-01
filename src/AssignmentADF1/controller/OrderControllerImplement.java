package AssignmentADF1.controller;

import AssignmentADF1.entity.Order;
import AssignmentADF1.model.OrderModel;
import AssignmentADF1.model.OrderModelImplement;
import AssignmentADF1.util.DateTimeUtil;
import AssignmentADF1.util.Validator;
import com.sun.org.apache.xpath.internal.operations.Or;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OrderControllerImplement implements OrderController {

    private OrderModel orderModel;
    private Scanner scanner;
    Locale locale = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(locale);

    public OrderControllerImplement() {
        this.orderModel = new OrderModelImplement();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void createNewOrder() {
        System.out.println("Please enter order information");
        String orderId, user, product, strPrice;
        do{
            System.out.println("Order id:");
            orderId = scanner.nextLine();
        }while (!Validator.maxLength(orderId, 10) || Validator.isEmpty(orderId));
        do{
            System.out.println("User name:");
            user = scanner.nextLine();
        }while (!Validator.maxLength(user, 16)  || Validator.isEmpty(user));
        do {
            System.out.println("Product:");
            product = scanner.nextLine();
        }while (Validator.isEmpty(product));
        do {
            System.out.println("Total price:");
            strPrice = scanner.nextLine();
        }while (!Validator.isInt(strPrice));
        int price = Integer.parseInt(strPrice);
        Order order = new Order(orderId, user, product, price);
        if (orderModel.save(order)){
            System.out.println("Action success!");
        }else {
            System.err.println("Action fail!");
        }
    }

    @Override
    public void showListOrder() {
        List<Order> list = orderModel.findAll();
        if (list.size() == 0){
            System.err.println("No order yet. Please create 1");
            return;
        }
        System.out.println("Order List");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s | %5s%10s%5s | %10s%10s%10s\n",
                "", "Id", "",
                "", "User", "",
                "", "Product", "",
                "", "Price(vnd)", "",
                "", "Status", "",
                "", "Created Date", "");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Override
    public void searchOrderById() {
        System.out.println("Enter order id to search:");
        String id = scanner.nextLine();
        Order order = orderModel.searchById(id);
        if (order == null){
            System.err.println("Not found.");
            return;
        }
        System.out.printf("There is 1 order match id %s:\n", id);
        System.out.println(order.toString() );
    }

    @Override
    public void showRevenue() {
        System.out.println("Enter start date in format yyyy-mm-dd: ");
        Date start = DateTimeUtil.parseDateFromString(scanner.nextLine());
        System.out.println("Enter end date in format yyyy-mm-dd: ");
        Date end = DateTimeUtil.parseDateFromString(scanner.nextLine());
        List<Order> orders = orderModel.searchByRange(start, end);
        List<Order> orders1 = orderModel.filterByStatus(orders, 2);
        if (orders1.isEmpty()){
            System.err.printf("Have no finished order from time %s to %s", start, end);
            return;
        }

        int revenue = 0;
        for (int i = 0; i < orders1.size(); i++) {
            revenue += orders1.get(i).getPrice();
            System.out.println(orders1.get(i).toString());
        }
        System.out.println("Total money:" + currencyVN.format(revenue));
    }

    @Override
    public void changeStatus() {
        System.out.println("Enter order's id to change status: ");
        String id = scanner.nextLine();
        Order order = orderModel.searchById(id);
        if (order == null){
            System.err.println("Not found.");
            return;
        }
        System.out.printf("There is 1 order match id %s:\n", id);
        System.out.println(order.toString());
        String newStatus;
        do {
            System.out.println("Change this order's status to (Enter 0 or 1 or 2 meaning Deleted, Pending and Paid respectively):");
            newStatus = scanner.nextLine();
        }while (!Validator.isOfStatusValue(newStatus));
        int newStatusInt = Integer.parseInt(newStatus);
        order.setStatus(newStatusInt);
        System.out.println("Success! Order after changing status: ");
        System.out.println(order.toString());
    }

    @Override
    public void updateInformation() {
        System.out.println("Enter order's id to update information: ");
        String id = scanner.nextLine();
        Order order = orderModel.searchById(id);
        if (order == null){
            System.err.println("Not found.");
            return;
        }
        System.out.printf("There is 1 order match id %s:\n", id);
        System.out.println(order.toString());
        System.out.println("Enter new Information to update:");
        Order updateOrder = new Order();
        String user, product, strPrice;
        do{
            System.out.println("New user name:");
            user = scanner.nextLine();
        }while (!Validator.maxLength(user, 16)  || Validator.isEmpty(user));
        updateOrder.setUser(user);
        do {
            System.out.println("New product:");
            product = scanner.nextLine();
        }while (Validator.isEmpty(product));
        updateOrder.setProducts(product);
        do {
            System.out.println("New total price:");
            strPrice = scanner.nextLine();
        }while (!Validator.isInt(strPrice));
        int price = Integer.parseInt(strPrice);
        updateOrder.setPrice(price);
        if (orderModel.update(id, updateOrder)){
            System.out.println("Action success");
        }else {
            System.out.println("Action fail");
        }
    }
}
