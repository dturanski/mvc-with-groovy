package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.service.SharedService;

@RestController
public class Controller {
	@Autowired SharedService service;
	@RequestMapping("/")
	public String home() {
		return service.getMessage();
	}
}
