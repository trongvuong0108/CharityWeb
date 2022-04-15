package com.code.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.baidang ;
import com.code.service.postService;

@Controller
public class homeController {
	@Autowired
	private postService postService;
	
	@GetMapping("/")
    public String listStudent(ModelMap model) {     
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("name",auth.getName());
		List<baidang> posts = postService.getAll();
		model.addAttribute("listPost", posts);
        return "home/home";
    }
	
	@GetMapping("/news")
    public String details(ModelMap model, @RequestParam int id) { 
		baidang baidang = postService.getById(id);
		model.addAttribute("baidang",baidang);	
        return "news/news";
    }
}
