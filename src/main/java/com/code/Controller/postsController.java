package com.code.Controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.Entity.baidang;
import com.code.Entity.dothienmau;
import com.code.IService.diadiemService;
import com.code.IService.dothienmauService;
import com.code.IService.postService;
import com.code.IService.userService;

@Controller
@RequestMapping("/admin/baidang")
public class postsController {
	@Autowired
	private postService postService;
	
	@Autowired
	private userService userService;
	
	@Autowired 
	private diadiemService diadiemService;
	
	@Autowired
	private dothienmauService dothienmauService;
	
	
	@GetMapping("")
	public String list(ModelMap model) {
		List<baidang> posts = postService.getAll();
		model.addAttribute("listPost", posts);
		return "admin/admin_news";
	}
	@GetMapping("/search")
	public String search(ModelMap model,@RequestParam String kw) {
		List<baidang> posts = postService.getAll();
		List<baidang> postSearch = new ArrayList<baidang>();
		for (baidang post : posts) {
			if(post.getNoidung().contains(kw)) postSearch.add(post);
		}
		model.addAttribute("listPost", postSearch);
		return "admin/admin_news";
	}
	
	@GetMapping("/new")
	public String save(Map<String, Object> model) {
		baidang baidang = new baidang();
		model.put("baidang", baidang);
		model.put("diadiems", diadiemService.getAll());
		model.put("dothienmaus", dothienmauService.getAll());
		return "news/write_news"; 
	}	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("baidang") baidang baidang ,@RequestParam int dothienmauId , @RequestParam int diadiemId) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		baidang.setUser(userService.getUserbyUserName(auth.getName()));
		baidang.setNgaydang(Calendar.getInstance().getTime());
		postService.savePost(baidang, dothienmauId, diadiemId);
		return "redirect:/"; 
	}
	
	@GetMapping("/edit")
	public String edit(Model model, @RequestParam int id) {
		dothienmau dothienmau = dothienmauService.getById(id);
		model.addAttribute("dothienmau", dothienmau);
		return "news/edit_news"; 
	}
	
}
