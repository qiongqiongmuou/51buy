package fun.xiaohang.order.service.impl;

import fun.xiaohang.order.feign.StorehouseApi;
import fun.xiaohang.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired(required = false)
    private StorehouseApi storehouseApi;

    @Override
    public String getOrderName(String orderName) {
        return orderName;
    }

    @Override
    public int notifyReduceStock(int stockNum) {
        return storehouseApi.doReduceStock(stockNum);
    }
}
