package fun.xiaohang.storehouse.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/storehouse/")
public class StockController {
    @PostMapping(path = "/reduceStock/{reduceStockNum}")
    public int reduceStock(@PathVariable(required = true) int reduceStockNum) {
        System.out.println(reduceStockNum);
        return reduceStockNum - 1;
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getStorehouseName() {
        return "get is Ok";
    }
}
