package com.mycarlong.mycarlongback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/my")
    @ResponseBody
    public String myAPI() {
        return "my route";
    }

//    @GetMapping("/testCookie")
//    @ResponseBody
//    public String testCookie() {
//        return "redirect:" +"https://kapi.kakao.com/v1/user/access_token_info";
//    }
    //
}
