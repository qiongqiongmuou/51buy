package fun.xiaohang.order.feign;

import org.springframework.stereotype.Component;

//@Service
@Component
public class StorehouseApiHystrixImpl implements StorehouseApi {
    @Override
    public int doReduceStock(int num) {
        return 0;
    }

    @Override
    public String getStorehouseName() {
        return "StorehouseHystrixImpl";
    }
}
