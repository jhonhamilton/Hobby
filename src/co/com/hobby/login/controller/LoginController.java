package co.com.hobby.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.com.hobby.login.modelo.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView("Login", "login", new Login());
		//return new ModelAndView("login", "command", new Login());
		return modelAndView;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String addLogin(@ModelAttribute("SpringWeb") Login login, ModelMap model){
		model.addAttribute("user", login.getUser());
		model.addAttribute("clave", login.getClave());
		model.addAttribute("id", login.getSesion());
		
		return "result";
	}
	
}
