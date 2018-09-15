package org.zh.springboot.helloworld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
    @RequestMapping("/index")
    public ModelAndView getIndex(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
