package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

   @RequestMapping("/errorgen")	
   public String errorGen() {
	   int num= (int) Math.random();
	   if(num%2==0)
	     throw new NumberFormatException();
	   else
		 throw new NullPointerException();   
   }
	
   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) 
   @ExceptionHandler(value=NumberFormatException.class)
   public String handlerForNumberFormatException(Model model) {
	   System.out.println("Numbner Format Exception occured");
	   model.addAttribute("msg", "Number Format Exception occured");
	   return "error_page";
   }
   //Demo for Path Variable annotation.
   @RequestMapping("/user/{userId}")
   public String user(@PathVariable("userId") int userId) {
	   System.out.println("The user id is : "+userId);
	   return "home";
   }
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView rv =new  RedirectView();
		rv.setUrl(url);
		return rv;
	}
	
	
	
}
