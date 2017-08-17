package zh.ffminx.spring.resource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengmin.xu E-mail: fengmin.xu@56qq.com
 * @since 2017-08-17 11:00
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/word")
    public String word() {
        return "World";
    }
}
