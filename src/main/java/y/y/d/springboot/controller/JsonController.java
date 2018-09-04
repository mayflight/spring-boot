package y.y.d.springboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import y.y.d.springboot.beans.Order;


@RestController
public class JsonController {
    @RequestMapping("/order")
    public Order user() {
        Order order = new Order();
        order.setOrder("12342");
        return order;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
