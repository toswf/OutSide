package com.toswf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by niuhao on 2016/10/25.
 */
@Controller
public class MainController {
    @RequestMapping(value = "index.do", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "test.do")
    public String test(){
        return "test";
    }

}
