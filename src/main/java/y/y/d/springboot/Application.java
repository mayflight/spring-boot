package y.y.d.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages ="y.y.d.springboot.service.dubbo")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
