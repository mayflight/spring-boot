package y.y.d.springboot.controller;
import com.yadong.ye.bean.MailDetailData;
import com.yadong.ye.dubbo.MailSendService;
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
    @Resource
    MailSendService mailSendService;

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

    @RequestMapping("/mail/send")
    public void sendMail() {
        MailDetailData data = new MailDetailData();
        data.setReceiveMailAccount("2454611074@qq.com");
        data.setSubject("测试");
        data.setContent("测试成功");
        mailSendService.sendSimpleMail(data);
    }
}
