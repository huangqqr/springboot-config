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

        StringBuffer sb = new StringBuffer();
        sb.append("Hello 阿博....");
        return sb.toString();
    }
    @RequestMapping("/way")
    public String way(){

        StringBuffer sb = new StringBuffer();
        sb.append("way 阿博....");
        return sb.toString();
    }

}