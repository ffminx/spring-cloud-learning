package zh.ffminx.spring.oauth;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 11:00
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
public class OauthApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(OauthApplication.class).web(true).run(args);

    }

}
