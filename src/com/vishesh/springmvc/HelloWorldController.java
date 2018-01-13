package com.vishesh.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Parent mapping to avoid ambiguity
public class HelloWorldController {

	// Need a controller to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// Need a controller to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// Add a controller to read the data and pass it to model
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		String theName = request.getParameter("Name");
		theName = theName.toUpperCase();
		String result = "Yo " + theName;
		model.addAttribute("message", result);

		return "helloworld";
	}

	// Add a controller to read the data using annotation and pass it to model
	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(@RequestParam("Name") String theName, Model model) {

		theName = theName.toUpperCase();
		String result = "Hey, my friend " + theName;
		model.addAttribute("message", result);

		return "helloworld";
	}
}
