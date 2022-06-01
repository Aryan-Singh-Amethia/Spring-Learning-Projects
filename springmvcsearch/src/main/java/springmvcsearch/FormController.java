package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String complexForm() {
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute ComplexForm complexForm,BindingResult result) {
		System.out.println(complexForm);
		if(result.hasErrors())
			return "complex_form";
		return "success";
	}
}
