package com.code.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.User;
import com.code.model.diadiem;
import com.code.model.role;
import com.code.service.roleService;
import com.code.service.userService;

@Controller
@RequestMapping("/admin/taikhoan")
public class UserController {
	@Autowired
	private userService userService;
	@Autowired
	private roleService roleService;

	@GetMapping("")
	public String list(ModelMap model) {
		List<User> Users = userService.getAll();
		List<User> userbyStatus = userService.findByStatus(true);
		model.addAttribute("userbyStatus", userbyStatus);
		model.addAttribute("listUser", Users);
		return "admin/admin_account";
	}
	
	@GetMapping("/search")
	public String search(ModelMap model,@RequestParam String kw) {
		List<User> users = userService.getAll(); 
		List<User> userSearch = new ArrayList<User>();
		for (User user : users) {
			if(user.getEmail().contains(kw)) userSearch.add(user);
		}
		model.addAttribute("listUser", userSearch);
		return "admin/admin_account";
	}
	
	@RequestMapping("/accept")
	public String accept(@RequestParam String username, Model model) {
		User user = userService.getUserbyUserName(username);
		role Role = roleService.getByName("ROLE_ADMIN");
		user.setUserRole(Role);
		user.setStatus(false);
		userService.addUser(user);	
		return "redirect:/";
	}
	
	
	
}
