package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("showing form");
		return "contact";
	}
	
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("username") String userName ,@RequestParam("email")
	 * String email ,@RequestParam("password") String password ,Model model){
	 * System.out.println(userName + " "+email+" "+password);
	 * 
	 * model.addAttribute("username", userName); model.addAttribute("password",
	 * password); model.addAttribute("email", email);
	 * 
	 * return "success"; }
	 */
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute 
			                 User user
	                        ,Model model){
		this.userService.createUser(user);
		System.out.println(user);
		return "success";
		
		//A better way of doing the same thing as the commented function
	}
	
	@ModelAttribute
	public void addCommonMessages(Model m) {
		m.addAttribute("message", "Thanks for registering :)");
		System.out.println("Adding common message");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
