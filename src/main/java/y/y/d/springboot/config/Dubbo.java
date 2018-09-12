package y.y.d.springboot.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Dubbo {

//    @Value("${dubbo.address}")
//    private String address;
//    @Value("${dubbo.protocol.name}")
//    private String protocolName;
//
//    @Value("${dubbo.protocol.port}")
//    private Integer protocolPort;
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("spring-boot");
//        applicationConfig.setLogger("log4j");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress(address);
//        registryConfig.setClient("zkclient");
//        return registryConfig;
//    }
//
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig config = new ProtocolConfig();
//        config.setName(protocolName);
//        config.setPort(protocolPort);
//        return config;
//    }
}
