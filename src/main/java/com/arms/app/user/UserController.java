package com.arms.app.user;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arms.domain.component.PageWrapper;
import com.arms.domain.entity.User;
import com.arms.domain.service.UserService;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;

	@RequestMapping("/user/list")
	public ModelAndView list(ModelAndView modelAndView, Principal principal, Pageable pageable) {
		// ---> Do Page
		Page<User> userPage = userService.findAllUser(pageable);
		PageWrapper<User> page = new PageWrapper<>(userPage, "/user/list");
		// <--- Do Page
		// List<User> users = userService.findAllUser();
		modelAndView.addObject("users", page.getContent());
		modelAndView.addObject("page", page);
		modelAndView.addObject("user/list");
		modelAndView.addObject("userId", userService.getUserId(principal));
		return modelAndView;
	}
}
