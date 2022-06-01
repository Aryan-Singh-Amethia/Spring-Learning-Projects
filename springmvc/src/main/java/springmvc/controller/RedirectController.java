package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		//Redirecting normally
		return "redirect:https://www.google.com/";
	}
	
	@RequestMapping("/two")
	public RedirectView two() {
		//Redirecting using RedirectView Class.
		RedirectView rv=new RedirectView();
		rv.setUrl("https://www.google.com/");
		return rv;
	}
}
