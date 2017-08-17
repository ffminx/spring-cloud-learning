package zh.ffminx.spring.oauth;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 11:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class OauthApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(OauthApplication.class).web(true).run(args);

    }

}
