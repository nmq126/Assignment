package AssignmentADF1.entity;

import AssignmentADF1.util.DateTimeUtil;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Order {
    private String orderId;
    private String user;
    private String products;
    private int price;
    private Date createdAt;
    private int status;

    private String getStatusName(){
        if (this.status == 1)
            return "Pending";
        else if (this.status == 2)
            return "Paid";
        else
            return "Deleted";
    }
    Locale locale = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(locale);
    @Override
    public String toString() {
        return String.format("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s | %5s%10s%5s | %10s%10s%10s\n",
                "", this.orderId, "",
                "", this.user, "",
                "", this.products, "",
                "", currencyVN.format(this.price), "",
                "", this.getStatusName(), "",
                "", this.getCreatedAtString(),"");
    }

    private String getCreatedAtString() {
        return DateTimeUtil.formatDateToString(this.createdAt);
    }

    public Order() {
    }

    public Order(String orderId, String user, String products, int price) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.price = price;
        this.createdAt = Calendar.getInstance().getTime();
        this.status = 1;
    }

    public Order(String orderId, String user, String products, int price, String strCreatedAt, int status) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.price = price;
        this.createdAt = DateTimeUtil.parseDateFromString(strCreatedAt);
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
