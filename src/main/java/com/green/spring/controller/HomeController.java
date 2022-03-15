package com.green.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/board")
	public String board() {
		return "/WEB-INF/front/board.jsp";
	}
}
