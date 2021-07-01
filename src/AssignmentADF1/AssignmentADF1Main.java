package AssignmentADF1;

import AssignmentADF1.view.OrderView;
import AssignmentADF1.view.OrderViewImplement;

public class AssignmentADF1Main {
    public static void main(String[] args) {
        OrderView orderView = new OrderViewImplement();
        orderView.generateMenu();
    }
}
