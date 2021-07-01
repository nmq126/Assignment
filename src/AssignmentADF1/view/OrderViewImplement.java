package AssignmentADF1.view;

import AssignmentADF1.controller.OrderController;
import AssignmentADF1.controller.OrderControllerImplement;

import java.util.Scanner;

public class OrderViewImplement implements OrderView {
    private OrderController orderController;
    private Scanner scanner;

    public OrderViewImplement() {
        this.orderController = new OrderControllerImplement();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void generateMenu() {
        while (true) {
            System.out.println("Order Management");
            System.out.println("---------------------------------");
            System.out.println("1. Create new order.");
            System.out.println("2. Search order by id.");
            System.out.println("3. Revenue by time.");
            System.out.println("4. Show list order.");
            System.out.println("5. Change order status.");
            System.out.println("6. Update order information.");
            System.out.println("7. Exit.");
            System.out.println("---------------------------------");
            System.out.println("Please enter your choice (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    orderController.createNewOrder();
                    break;
                case 2:
                    orderController.searchOrderById();
                    break;
                case 3:
                    orderController.showRevenue();
                    break;
                case 4:
                    orderController.showListOrder();
                    break;
                case 5:
                    orderController.changeStatus();
                    break;
                case 6:
                    orderController.updateInformation();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid choice. Please choose between 1 and ");
                    break;
            }
            if (choice == 7) {
                break;
            }
            scanner.nextLine();
        }
    }
}
