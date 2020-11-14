package com.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.entity.User;
import com.service.UserService;

@Controller 
public class UserController {
	@Resource
	private UserService userService;
		
	@RequestMapping("/login")
	public String login(String userName,String userPass,HttpSession session,ModelMap m) {
		User user =userService.getUserByNameOrEmail(userName);
		
		if(user!=null) {
			if(userPass.equals(user.getUserPass())) {
				session.setAttribute("session_user", user); 
				return "index"; 
			}
			else {
				m.put("msg","密码错误");
				return "login";
			}
		}
		else {
			m.put("msg","用户名错误");
			return "login";
		}	
	}
}
