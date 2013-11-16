package com.springapp.mvc;

import com.springapp.bean.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello index!");
        return "index";
    }
    @RequestMapping(value = "/getMessage")
    @ResponseBody
    public Message getMessage(){
        Message message = new Message();
        message.setContent("我是内容");
        message.setSubject("我是主题");
        message.setId(1);
        return  message;
    }
}