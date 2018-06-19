package pe.com.trujinet.deliver.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/hola")
	public String get() {
		return "saludos";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String ShowWelcomePage(ModelMap model) {
		return "app/welcome";
	}
}
