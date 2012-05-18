package net.roseindia.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")
public class LoginFormController extends SimpleFormController {
	
	@Override
	protected ModelAndView onSubmit(Object command) throws ServletException {
		
		Login login = (Login) command;
		String name = login.getUsername();
		
		ModelAndView modelAndView = new ModelAndView("succes");
		modelAndView.addObject("name", name);
		modelAndView.addObject("loginObj", login);
		
		List<Login> list = new ArrayList<Login>();
		list.add(new Login("navn","navn@123"));
		list.add(new Login("prasad","prsd@123"));
		list.add(new Login("padmavathi","padmavathi@123"));
		modelAndView.addObject("objs", list);
		
		return modelAndView;
    }
}
