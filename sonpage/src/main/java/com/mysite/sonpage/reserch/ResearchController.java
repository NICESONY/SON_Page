package com.mysite.sonpage.reserch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResearchController {
	
	
	
	@GetMapping("/research")
	public String reserch() {
		return "research/research";	}

}
