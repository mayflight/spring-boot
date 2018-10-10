package y.y.d.springboot.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.yadong.ye.bean.BaseResult;
import com.yadong.ye.bean.MailDetailData;
import com.yadong.ye.dubbo.MailSendService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.annotation.Resource;

/**
 * @author yyd
 * @date 2018/10/10
 */
@Service(timeout = 30000)
public class MailSendServiceImpl implements MailSendService{

    @Resource
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String sendMailAccount;

    @Override
    public BaseResult sendSimpleMail(MailDetailData mailDetailData) {
        BaseResult result = new BaseResult();
        if (null == mailDetailData) {
            result.setCode(1);
            result.setMessage("mailDetailData is null");
            return result;
        }
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sendMailAccount);
        message.setTo(mailDetailData.getReceiveMailAccount());
        message.setSubject(mailDetailData.getSubject());
        message.setText(mailDetailData.getContent());
        try {
            mailSender.send(message);
        }catch (Exception e) {
            result.setCode(1);
            result.setMessage(e.getMessage());
            return result;
        }
        result.setCode(0);
        result.setMessage("send success");
        return result;
    }
}
