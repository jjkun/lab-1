package mx.com.cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab1Controller {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
}
