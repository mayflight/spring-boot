package y.y.d.springboot.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;
import com.yadong.ye.dubbo.YYPayService;
import org.springframework.stereotype.Component;

@Component
@Service(timeout = 30000, delay = -1)
public class YYPayServiceImplements implements YYPayService {
    @Override
    public DealOrderResult dealOrder(Order order) {
        DealOrderResult result = new DealOrderResult();
        result.setError("error");
        return result;
    }
}
