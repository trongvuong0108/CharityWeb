package com.code.controllers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.User;
import com.code.model.role;
import com.code.service.roleService;
import com.code.service.userService;

@Controller
public class loginController {
	@Autowired
	private userService userService;

	@Autowired
	private roleService roleService;

	@RequestMapping("/login")
	public String login(ModelMap model) {
		
		return "login/login";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}

	@RequestMapping("/signup")
	public String sigup(Map<String, Object> model) {
		User user = new User();
		model.put("user", user);
		return "login/signup";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("user") User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setMatkhau(encoder.encode(user.getMatkhau()));
		role Role = roleService.getByName("ROLE_USER");
		user.setUserRole(Role);
		user.setStatus(false);
		userService.addUser(user);
		return "redirect:/login";
	}
	
	@RequestMapping("/changeInfo")
	public String changeInfo(@RequestParam String username, Model model) {
		User user = userService.getUserbyUserName(username);
		model.addAttribute("user", user);
		return "login/info_user";
	}
	
	@PostMapping("/saveInfo")
	public String saveInfo(@ModelAttribute("user") User user) {
		role Role = roleService.getByName("ROLE_USER");
		user.setUserRole(Role);
		user.setStatus(false);
		userService.addUser(user);
		return "redirect:/";
	}

	@RequestMapping("/adminRequest")
	public String adminRequest(@RequestParam String username, Model model) {
		User user = userService.getUserbyUserName(username);
		user.setStatus(true);
		userService.addUser(user);	
		return "redirect:/";
	}
	
	@RequestMapping("/changePassWord")
	public String changePassWord(@RequestParam String username, Model model) {
		//User user = userService.getUserbyUserName(username);
		return "login/change_pass";
	}
	
	@PostMapping("/savePassword")
	public String changePassWord(@ModelAttribute("user") User user, @RequestParam String username) {
		User temp = userService.getUserbyUserName(username);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		temp.setMatkhau(encoder.encode(user.getMatkhau()));
		userService.addUser(temp);
//		System.out.print(user.toString());
		return "redirect:/";
	}
}
