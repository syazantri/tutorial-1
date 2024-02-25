package id.ac.ui.cs.advprog.eshop.model;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Builder
@Getter
public class Order {
    String id;
    List<Product> products;
    Long orderTime;
    String author;
    @Setter
    private String status;

    public Order(String id, List<Product> products, Long orderTime, String author) {
        this.id = id;
        this.products = products;
        this.orderTime = orderTime;
        this.author = author;
        this.status = "WAITING_PAYMENT";

        if (products.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.products = products;
        }
    }

    public Order(String id, List<Product> products, Long orderTime, String author, String status) {
        this(id, products, orderTime, author);

        String[] statusList = {"WAITING_PAYMENT", "FAILED", "SUCCESS", "CANCELLED"};
        if (Arrays.stream(statusList).noneMatch(item -> (item.equals(status)))) {
            throw new IllegalArgumentException();
        } else {
            this.status = status;
        }
    }

    public void setStatus(String status) {
        String[] statusList = {"WAITING_PAYMENT", "FAILED", "SUCCESS", "CANCELLED"};
        if (Arrays.stream(statusList).noneMatch(item -> (item.equals(status)))) {
            throw new IllegalArgumentException();
        } else {
            this.status = status;
        }
    }
}

