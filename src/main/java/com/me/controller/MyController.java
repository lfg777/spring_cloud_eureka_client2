package com.me.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifengguang on 2017/6/23.
 */
@RestController
public class MyController {

    @RequestMapping("/goAhead")
    public String goAhead(){
        return "I'm another client,welcome to here !";
    }

}
