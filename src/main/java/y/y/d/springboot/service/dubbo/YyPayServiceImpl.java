package y.y.d.springboot.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;
import com.yadong.ye.dubbo.YyPayService;
import org.springframework.stereotype.Component;

/**
 * @author Ton
 */
//@Component
@Service(timeout = 30000,
        delay = -1)
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}")
public class YyPayServiceImpl implements YyPayService {
    @Override
    public DealOrderResult dealOrder(Order order) {
        DealOrderResult result = new DealOrderResult();
        result.setError("success");
        return result;
    }
}
