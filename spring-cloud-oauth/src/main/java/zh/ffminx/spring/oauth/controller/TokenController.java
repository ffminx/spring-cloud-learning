package zh.ffminx.spring.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 18:22
 */
@RestController
public class TokenController {

    @RequestMapping("/")
    public String getToken() {
        return "token123";
    }

}
