package AssignmentADF1.model;

import AssignmentADF1.entity.Order;

import java.util.Date;
import java.util.List;

public interface OrderModel {
    boolean save(Order obj);
    List<Order> findAll();
    Order searchById(String id);
    List<Order> searchByRange(Date start, Date end);
    List<Order> filterByStatus(List<Order> list, int status);
    boolean update(String id, Order updateObj);
}
