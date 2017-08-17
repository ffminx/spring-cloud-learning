package zh.ffminx.spring.resource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 11:00
 */
@SpringBootApplication
@EnableEurekaClient
public class ResourceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ResourceApplication.class).web(true).run(args);

    }

}
