package com.rotation.ss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Wangxudong
 * Date: 2017/2/22
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TopShowController {

    @RequestMapping("/index")
    public String helloHtml(){
        return"/index";
    }
}
