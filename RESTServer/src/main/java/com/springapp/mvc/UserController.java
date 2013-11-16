package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lenovo
 * Date: 13-11-15
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/{id}")
    public void sayHello(@PathVariable Integer id, HttpServletResponse response) {
        try {
            response.getWriter().write(" hello" + id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/hello")
    public void hello(HttpServletResponse response) {
        try {
            response.getWriter().write("only hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
