package pe.com.trujinet.deliver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String ShowLoginPage(ModelMap model) {
		return "login";
	}
	

}
