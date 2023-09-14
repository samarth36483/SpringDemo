package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import services.MyFirstService;

@RestController
public class MyFirstController {
	private MyFirstService myFirstService;
	
	public MyFirstController(MyFirstService myFirstService) {
		this.myFirstService = myFirstService;
	}
	
	@GetMapping("/")
	public static String sayHi() {
		return "Hey there!";
	}

}
