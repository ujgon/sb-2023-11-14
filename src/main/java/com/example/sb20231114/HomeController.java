package com.example.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
        //리턴값을 고객에게 보이시오(브라우저에서)
    String showMain() {
        System.out.println("안녕하세요!!!");
        return "안녕하세요.";
    }

    @GetMapping("/about")
    @ResponseBody
        //리턴값을 고객에게 보이시오(브라우저에서)
    String showAbout() {
        return "개발자 커뮤니티.";
    }

    @GetMapping("/calc")
    @ResponseBody
        //리턴값을 고객에게 보이시오(브라우저에서)
    String showCalc(int a, int b) {
        return "계산 결과 : %d".formatted(a + b);
    }

    @GetMapping("/calc2")
    @ResponseBody
        //리턴값을 고객에게 보이시오(브라우저에서)
    String showCalc2(Integer a, Integer b) {
        return "a : " + a + ", b :" + b;
    }


    @GetMapping("/calc11")
    @ResponseBody
    List<Integer> showCalc11() {
        List<Integer> nums = new ArrayList<>() {{
            add(10);
            add(-510);
            add(10010);
        }};

        return nums;
    }

    @GetMapping("/calc12")
    @ResponseBody
    int[] showCalc12() {
        int[] nums = new int[]{10, -510, 10010};

        return nums;
    }

    int num = 0;
    //문제
    //코드예시
    @GetMapping("/calc22")
    @ResponseBody
    int showCalc22() {

        num++;

        return num;
    }




}

