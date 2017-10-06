package com.arms.domain.component;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.arms.domain.service.AppService;

@Component
public class ControllerAspect {
	@Autowired
	AppService appService;
	
	public ModelAndView setIsLogin(ModelAndView modelAndView, Principal principal){
		Authentication authentication = (Authentication)principal;
		if(authentication != null && authentication.isAuthenticated()){
			modelAndView.addObject("isLogin", true);
			modelAndView.addObject("loginUser", appService.findOne(principal));
			return modelAndView;
		} else {
			return modelAndView.addObject("isLogin", false);
		}
	}
}
