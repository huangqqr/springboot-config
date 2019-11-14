package com.hb.springbootconfig.springbootconfig.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Dr.HuangBo
 * @since: 2019-11-14 09:42
 **/
@RequestMapping("/test")
@RestController
public class HelloWork {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello 阿博....";
    }

    @RequestMapping("/way")
    public String way(){

        return "way 阿博....";
    }
}