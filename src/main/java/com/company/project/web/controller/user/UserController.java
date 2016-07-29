package com.company.project.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户信息控制器
 *
 * @author wangzhj
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public ModelAndView list(){

        return new ModelAndView("/user/userList");
    }
}