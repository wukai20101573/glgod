package com.glgod.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Wukai on 2016/12/8.
 */
@Controller
public class indexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index/index";
    }
}
