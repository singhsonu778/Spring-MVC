package com.sonu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/pages/final.html";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "final";
	}

}
