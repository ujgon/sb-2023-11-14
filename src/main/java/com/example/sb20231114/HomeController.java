package com.example.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody    //리턴값을 고객에게 보이시오(브라우저에서)
    String showMain() {
        System.out.println("안녕하세요!!!");
        return "안녕하세요.";
    }
}
