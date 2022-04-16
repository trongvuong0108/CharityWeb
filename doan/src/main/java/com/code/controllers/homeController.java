package com.code.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.baidang;
import com.code.repository.postRepository;
import com.code.service.postService;

@Controller
public class homeController {
	@Autowired
	private postService postService;

	@Autowired
	private postRepository postRepository;

	@GetMapping("/")
	public String listStudent(ModelMap model, @RequestParam("p") Optional<Integer> p) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("name", auth.getName());
		// List<baidang> posts = postService.getAll();
		Pageable pageable = PageRequest.of(p.orElse(0), 4);
		Page<baidang> page = postRepository.findAll(pageable);
		model.addAttribute("listPost", page);
		return "home/home";
	}

	@GetMapping("/news")
	public String details(ModelMap model, @RequestParam int id) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("name", auth.getName());
		baidang baidang = postService.getById(id);
		model.addAttribute("baidang", baidang);
		return "news/news";
	}
}
