package com.vishist.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LocationController {

		@RequestMapping(path="/showCreate")
		public ModelAndView showCreate() {
			return new ModelAndView("createLocation");
		}
}
