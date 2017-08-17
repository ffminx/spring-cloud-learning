package zh.ffminx.spring.service.center;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 14:24
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenterApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceCenterApplication.class).run(args);

    }
}
