package com.example.springLIveWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {
	
	@GetMapping("/two")
  public String two() {
	  return "two";
  }

}
