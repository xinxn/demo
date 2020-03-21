package com.example.demo.contorller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebContorller {
	
	@RequestMapping("/hello")
    public ModelAndView searchOrgInfoView(HttpServletRequest req) {
		req.setAttribute("OrgData", null);
        return new ModelAndView("/test");
    }
}
