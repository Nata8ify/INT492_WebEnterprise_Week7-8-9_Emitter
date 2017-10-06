package com.arms.app.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arms.domain.entity.User;
import com.arms.domain.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/user/list")
	public ModelAndView list(ModelAndView modelAndView) {
		List<User> users = userService.findAllUser();
		modelAndView.addObject("users", users);
		modelAndView.addObject("user/list");
		return modelAndView;
	}
}
