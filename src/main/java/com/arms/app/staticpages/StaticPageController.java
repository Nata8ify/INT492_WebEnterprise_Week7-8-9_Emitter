package com.arms.app.staticpages;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
	

	@RequestMapping("/help")
	public String help(Principal principal){
		return "static/help";
	}

	@RequestMapping("/about")
	public String about(Principal principal){
		return "static/about";
	}
}
