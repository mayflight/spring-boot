package y.y.d.springboot.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import y.y.d.springboot.beans.Order;
import y.y.d.springboot.entity.Trade;
import y.y.d.springboot.service.data.TradeService;

import javax.annotation.Resource;


@RestController
public class JsonController {

    @Resource
    private TradeService tradeService;

    @RequestMapping("/order")
    public Order user() {
        Order order = new Order();
        order.setOrder("12342");
        return order;
    }

    @RequestMapping("/trade/{id}")
    public Trade trade(@PathVariable int id) {
        return tradeService.selectByPrimaryKey(id);
    }
}
