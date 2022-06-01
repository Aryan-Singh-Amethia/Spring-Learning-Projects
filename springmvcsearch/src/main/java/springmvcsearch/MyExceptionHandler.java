package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice  //tells Spring to refer to this class for handling exceptions.
public class MyExceptionHandler {
	
	   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) 
	   @ExceptionHandler(value=NumberFormatException.class)
	   public String handlerForNumberFormatException(Model model) {
		   System.out.println("Numbner Format Exception occured");
		   model.addAttribute("msg", "Number Format Exception occured");
		   return "error_page";
	   }
	   
	   @ResponseStatus(HttpStatus.BAD_REQUEST)
	   @ExceptionHandler(value=NullPointerException.class)
	   public String HandlerForNullPointerException(Model model) {
		   System.out.println("Null Pointer Exception occured.");
		   model.addAttribute("msg", "Null Pointer Exception Occured");
		   return "error_page";
	   }
}
