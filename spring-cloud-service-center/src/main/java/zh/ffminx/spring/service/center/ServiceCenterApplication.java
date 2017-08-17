package zh.ffminx.spring.service.center;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 14:24
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaServer
public class ServiceCenterApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceCenterApplication.class).run(args);

    }
}
