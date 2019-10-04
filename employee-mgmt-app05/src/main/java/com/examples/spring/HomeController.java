package com.examples.spring;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.spring.model.Employee;
import com.examples.spring.service.EmployeeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	EmployeeService eserv = new EmployeeService();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@ModelAttribute("employee")
	public Employee emp()
	{
		return new Employee();
	}
	
	
	@RequestMapping(value= "/add", method = RequestMethod.GET)
	public String showRegisterForm() throws SQLException {

		return "add";
	}
	@RequestMapping(value= "/add", method = RequestMethod.POST)
	public String addDetails(@ModelAttribute("employee") Employee emp1) throws SQLException {
		System.out.println(emp1);
		eserv.add(emp1);
		return "view";
	}
	@RequestMapping(value= "/delete", method = RequestMethod.GET)
	public String showdDetails() {
		
		return "delete";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteDetails(@RequestParam("id") int id) throws SQLException {	
		
		eserv.delete(id);
		return "view";
	}
	@RequestMapping(value= "/update", method = RequestMethod.GET)
	public String showuDetails() {
		
		return "update";
	}
	
	@RequestMapping(value= "/update", method = RequestMethod.POST)
	public String updateDetails(@ModelAttribute("employee") Employee emp1) throws SQLException {	
		
		eserv.update(emp1);
		return "view";
	}
	@RequestMapping(value= "/view", method = RequestMethod.GET)
	public String view(Model e) {
		List<Employee> empList = null;
		try {
			empList = eserv.viewAll();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.addAttribute("elist", empList);
		
		return "view";
	}
	
	
	
}