package com.arms.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/user/login")
	public ModelAndView login(ModelAndView modelAndView){
		modelAndView.setViewName("user/login");
		return modelAndView;
	}
}
