package me.laszloszoboszlai.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//GET request
	@RequestMapping("/hello")
	public String sayHelloWorld(){
		return "Hello World!";
	}
}
