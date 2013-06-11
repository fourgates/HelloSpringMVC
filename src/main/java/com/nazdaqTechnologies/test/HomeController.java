package com.nazdaqTechnologies.test;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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


//	@RequestMapping(value = "/cars", method = RequestMethod.GET)
//	@ResponseBody
//	public String handlePost(@RequestParam(value="make",required=false) String make,
//			@RequestParam(value="model",required=false) String model,
//			@RequestParam(value="year",required=false) String year, HttpServletRequest request) {
//
//		log.debug(request.getParameterMap().keySet().toString());
//		
//		Map map = request.getParameterMap();
//		String make = (String) map.get("make");
//		return make+" "+model+" "+year;
//
//	}
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	@ResponseBody
	public String handlePost(HttpServletRequest request) {

		log.debug(request.getParameterMap().keySet().toString());
		
		Map map = request.getParameterMap();
		String year = request.getParameter("year");
		String model = request.getParameter("model");
		String make = request.getParameter("make");
		Iterator it = map.keySet().iterator();
		while(it.hasNext())
		{
			log.debug("Iterator: "+it.next().toString());
		}
		
		//return make+" "+model+" "+year;
		return it.toString();

	}

}
