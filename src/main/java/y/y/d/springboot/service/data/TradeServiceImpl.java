package y.y.d.springboot.service.data;

import org.springframework.stereotype.Service;
import y.y.d.springboot.dao.TradeDAO;
import y.y.d.springboot.entity.Trade;

import javax.annotation.Resource;

/**
 * @author yyd
 * @date 2018/9/14
 */
@Service("tradeService")
public class TradeServiceImpl implements TradeService{

    @Resource
    private TradeDAO tradeDAO;

    @Override
    public Trade selectByPrimaryKey(int key) {
        return tradeDAO.selectByPrimaryKey(key);
    }
}
