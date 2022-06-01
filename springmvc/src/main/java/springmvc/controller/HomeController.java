package springmvc.controller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
/* @RequestMapping("/first") */
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Inside home");
		model.addAttribute("name", "Aryan Singh Amethia");
		model.addAttribute("id",109);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("Inside about");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Inside help");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name", "Aryan");
		mav.addObject("roll", 1805109);
		
		//adding local date-time
		LocalDateTime time=LocalDateTime.now();
		mav.addObject("time", time);
		
		//set view name
		mav.setViewName("help");
		return mav;
	}

}