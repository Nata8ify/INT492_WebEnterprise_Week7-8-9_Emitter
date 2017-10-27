package com.arms.app.staticpages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
	

	@RequestMapping("/help")
	public String help(){
		return "static/help";
	}

	@RequestMapping("/about")
	public String about(){
		return "static/about";
	}
}
