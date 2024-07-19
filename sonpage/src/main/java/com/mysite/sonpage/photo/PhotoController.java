package com.mysite.sonpage.photo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PhotoController {
	
	
	@GetMapping("/photo")
	public String photo() {
		return "photo/photo";	}

}
