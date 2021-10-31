package com.springboot.chapter2.main.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "idnex";
    }
}
