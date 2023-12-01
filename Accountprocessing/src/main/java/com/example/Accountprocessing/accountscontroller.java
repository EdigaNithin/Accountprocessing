package com.example.Accountprocessing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountscontroller {
	@GetMapping(path="/account")
	public String getall() {
		return "HI welcome";
	}

}
