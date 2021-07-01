package AssignmentADF1.model;

import AssignmentADF1.entity.Order;
import assignment.t2012e.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModelImplement implements OrderModel {

    private List<Order> list;

    {
        list = new ArrayList<>();
        list.add(new Order("Order001", "Quang", "1 can gao", 100000, "2021-06-01", 1));
        list.add(new Order("Order002", "Quang", "1 can gao", 120000, "2021-06-11", 2));
        list.add(new Order("Order003", "Quang", "1 can gao", 100000, "2021-06-12", 1));
        list.add(new Order("Order004", "Quang", "1 can gao", 100000, "2021-06-21", 2));
        list.add(new Order("Order005", "Quang", "1 can gao", 145000, "2021-06-22", 2));
        list.add(new Order("Order006", "Quang", "1 can gao", 100000, "2021-06-30", 2));
    }

    @Override
    public boolean save(Order obj) {
        list.add(obj);
        return true;
    }

    @Override
    public List<Order> findAll() {
        return list;
    }

    @Override
    public Order searchById(String id) {
        Order order = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getOrderId().equals(id)) {
                order = list.get(i);
                break;
            }
        }
        return order;
    }

    @Override
    public List<Order> searchByRange(Date start, Date end) {
//        end.setHours(24);
        List<Order> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Date createdDate = list.get(i).getCreatedAt();
            if(createdDate.after(start) && createdDate.before(end)){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    @Override
    public List<Order> filterByStatus(List<Order> list, int status) {
        List<Order> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus() == status){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    @Override
    public boolean update(String id, Order updateObj) {
        Order existingOrder = searchById(id);
        if (existingOrder == null){
            return false;
        }
        existingOrder.setUser(updateObj.getUser());
        existingOrder.setProducts(updateObj.getProducts());
        existingOrder.setPrice(updateObj.getPrice());
        return true;
    }
}
