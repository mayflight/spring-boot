package y.y.d.springboot.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;
import com.yadong.ye.dubbo.YyPayService;
/**
 * @author Ton
 */
@Service(timeout = 30000)
public class YyPayServiceImpl implements YyPayService {
    @Override
    public DealOrderResult dealOrder(Order order) {
        DealOrderResult result = new DealOrderResult();
        result.setError("success,spring_boot");
        return result;
    }
}
