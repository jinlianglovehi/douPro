package com.doudou.cn.plateform.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.doudou.cn.plateform.pojo.User;
import com.doudou.cn.plateform.service.IUserService;
import com.doudou.cn.plateform.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	private static final String TAG = "UserController"; 
	@Resource()
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		System.out.println("UserController toIndex: "); 
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
