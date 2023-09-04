package gr.aueb.cf.springstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello-app")
public class HelloController {
//    @RequestMapping(path = "/coding-factory", method = RequestMethod.GET)
    @GetMapping("/hello-world")
    public String getHello(){
        return "index";
    }
}
