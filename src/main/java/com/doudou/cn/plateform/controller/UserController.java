package com.doudou.cn.plateform.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;

import com.doudou.cn.plateform.pojo.User;
import com.doudou.cn.plateform.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource()
    private IUserService userService;


    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        System.out.println("UserController toIndex: ");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return null;
    }

    @GET
    @RequestMapping("/getInfo.do")
    public String getUserInfo() {
        System.out.println("UserController getUserInfo: ");
        return "user/getInfo";
    }

    @GET
    @RequestMapping("insertUserInfo.do")
    public String inserUserInfo() {

        User user = new User();
//        user.setId(1);
        user.setAge(20);
        user.setUserName("huhu");
        user.setPassword("123");
//		添加用户的信息
        this.userService.insertSelective(user);

        return "user/getInfo";

    }
}
