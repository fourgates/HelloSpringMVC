package com.nazdaqTechnologies.test;

import java.text.DateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger log = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		log.info("Welcome home! The client locale is {}.");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG);

		String formattedDate = dateFormat.format(date);

		// model.addAttribute("serverTime", formattedDate );

		String str = " Hi Naz the date today is " + formattedDate;

		return str;
	}

	@RequestMapping(value = "/procesJson", method = RequestMethod.GET)
	@ResponseBody
	public String handlePost() {

		return "procesjson handler";

	}

}
