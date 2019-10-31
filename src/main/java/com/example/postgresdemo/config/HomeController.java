package io.swagger.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Home redirection to swagger api documentation 
 */
@EnableSwagger2
@Controller
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
