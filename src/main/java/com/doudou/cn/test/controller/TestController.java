package com.doudou.cn.test.controller;

import com.doudou.cn.plateform.pojo.User;
import com.doudou.cn.plateform.service.IUserService;
import com.doudou.cn.test.pojo.UserT;
import com.doudou.cn.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by jinliang on 16/3/11.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;


    @RequestMapping("/showUser.do")
    public String toIndex() {
        System.out.println("test showUser.do toIndex: ");

        UserT userT = new UserT();
        userT.setAge(20);
        userT.setPassword("1222");
        userT.setUserName("testnane");
        testService.insertSelective(userT);
        userT.setId(1);
        return null;
    }



    @RequestMapping("/getuser.do")
    public String getUser() {
        System.out.println("test getUser.do toIndex: ");


       UserT userT =  testService.getUserById(1);

        System.out.println("userT:" + userT.getUserName());
        return null;
    }
}
