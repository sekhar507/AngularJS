package com.concretepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/app")
public class HomeController {
	@RequestMapping("/page-ngresource")
	public String pageNgResource() {
 		return "page-ngresource";
 	}
	@RequestMapping("/page-http")
	public String pageHttp() {
 		return "page-http";
 	}
}
