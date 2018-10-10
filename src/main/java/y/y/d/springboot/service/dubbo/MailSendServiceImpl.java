package y.y.d.springboot.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
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
    public void sendSimpleMail(MailDetailData mailDetailData) {
        if (null == mailDetailData) {
            return;
        }
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sendMailAccount);
        message.setTo(mailDetailData.getReceiveMailAccount());
        message.setSubject(mailDetailData.getSubject());
        message.setText(mailDetailData.getContent());
        try {
            mailSender.send(message);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
