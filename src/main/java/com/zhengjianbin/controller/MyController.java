package com.zhengjianbin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengjianbin on 2019/12/4.
 */
@RestController
public class MyController {


    @GetMapping("/index")
    public String testAop(){
        System.out.println("方法执行完毕......");
        return "这是TestAop()，准备AOP";
    }

}



