package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String viewLogin(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("controller call");
        return "LoginForm";
    }

}
