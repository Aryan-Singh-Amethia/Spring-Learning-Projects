package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
   
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "uploadFile";
	}
	
	@RequestMapping(path="/uploadimage",method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession session,Model model) {
		System.out.println("file upload handler");
		
		//Displaying the size of the user-uploaded image
		System.out.println(file.getSize());
		
		//Storing the uploaded-file.
		byte data[]= file.getBytes();
		
		//Saving the image on the server
		String path = session.getServletContext().getRealPath("/")
				    + "WEB-INF" + File.separator 
				    + "resources" + File.separator
				    + "images" + File.separator
				    + file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded");
			
			model.addAttribute("msg", "uploaded successfully");
			model.addAttribute("filename", file.getOriginalFilename());
			
		} catch (IOException e) {
			System.out.println("Error while uploading file");
			e.printStackTrace();
			model.addAttribute("msg", "uploading error");
		}
		return "filesuccess";
	}
}
