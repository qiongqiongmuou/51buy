package fun.xiaohang.order.rest;

import fun.xiaohang.order.entity.vo.NotifyReduceStockVo;
import fun.xiaohang.order.feign.StorehouseApi;
import fun.xiaohang.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order/")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired(required = false)
    private StorehouseApi storehouseApi;

    @RequestMapping(path = "/getOrderName", method = RequestMethod.GET)
    public String getOrderName(@RequestParam(required = true) String orderName) {
        return orderService.getOrderName(orderName);
    }

    @RequestMapping(path = "/notifyReduceStock", method = RequestMethod.POST)
    public int notifyReduceStock(@RequestBody(required = true) NotifyReduceStockVo stockNum) {
        System.out.println(stockNum);
        return orderService.notifyReduceStock(stockNum.getStockNum());
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getStorehouseName() {
        return storehouseApi.getStorehouseName();
    }
}
