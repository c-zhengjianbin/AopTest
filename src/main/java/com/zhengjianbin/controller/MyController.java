package com.zhengjianbin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhengjianbin on 2019/12/4.
 */
@RestController
public class MyController {


    @GetMapping("/index")
    public String testAop(String name,String age){
        System.out.println("方法执行完毕......"+name+"--"+age);
        return "这是TestAop()，准备AOP";
    }

    @GetMapping("/index2")
    public String testAop1(String sex,String className){
        System.out.println("方法执行完毕......"+sex+"--"+className);
        return "这是TestAop()，准备AOP";
    }

}



