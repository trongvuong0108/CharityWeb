package com.code.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.dothienmau;
import com.code.service.dothienmauService;

@Controller
@RequestMapping("/admin/dothienmau")
public class dothienmauController {
	@Autowired
	private dothienmauService dothienmauService;

	@GetMapping("")

	public String list(ModelMap model) {
		List<dothienmau> dothienmaus = dothienmauService.getAll();
		model.addAttribute("dothienmaus", dothienmaus);
		return "dothienmau/blood_date";
	}

	@GetMapping("/new")
	public String save(Map<String, Object> model) {
		dothienmau dothienmau = new dothienmau();
		model.put("dothienmau", dothienmau);
		return "dothienmau/blood_date_info";
	}

	@PostMapping(value = "/save")
	public String save(@ModelAttribute("dothienmau") dothienmau dothienmau) {
		dothienmauService.saveDothienmau(dothienmau);
		return "redirect:/admin/dothienmau";
	}
	
	@PostMapping(value = "/saveEdit")
	public String saveEdit(@RequestParam int id , @ModelAttribute("dothienmau") dothienmau dothienmau) {
		dothienmauService.saveDothienmau(dothienmau);
		return "redirect:/admin/dothienmau";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam int id, Model model) {
		dothienmau dothienmau = dothienmauService.getById(id);
		model.addAttribute("dothienmau", dothienmau);
		return "dothienmau/blood_date_info";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		dothienmauService.deleteDothienmau(id);
		return "redirect:/admin/dothienmau";
	}

}
