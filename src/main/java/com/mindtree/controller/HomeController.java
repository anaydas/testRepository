/**
 * 
 */
package com.mindtree.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Anay
 *
 */
@Controller
public class HomeController {

	private Logger logger=Logger.getLogger(HomeController.class);
	
	@RequestMapping("/home.htm")
	public ModelAndView getHomePage(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
		}
}
