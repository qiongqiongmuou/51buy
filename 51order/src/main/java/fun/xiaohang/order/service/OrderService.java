package fun.xiaohang.order.service;

public interface OrderService {
    String getOrderName(String orderName);

    int notifyReduceStock(int stockNum);
}
