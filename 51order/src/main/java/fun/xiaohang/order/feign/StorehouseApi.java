package fun.xiaohang.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "51-STOREHOUSE"
        , fallback = StorehouseApiHystrixImpl.class)
@RequestMapping("/api/v1/storehouse/")
public interface StorehouseApi {
    @RequestMapping(value = "/reduceStock/{num}", method = RequestMethod.POST)
    int doReduceStock(@PathVariable(required = true, name = "num") int num);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String getStorehouseName();
}
