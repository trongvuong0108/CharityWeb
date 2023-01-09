package com.code.Controller;

import java.util.ArrayList;
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

import com.code.Entity.diadiem;
import com.code.IService.diadiemService;

@Controller
@RequestMapping("/admin/diadiem")
public class diadiemController {
	@Autowired
	private diadiemService diadiemService;

	@GetMapping("")
	public String list(ModelMap model) {
		List<diadiem> diadiems = diadiemService.getAll();
		model.addAttribute("listDiadiem", diadiems);
		return "diadiem/list_addess";
	}
	
	@GetMapping("/search")
	public String search(ModelMap model,@RequestParam String kw) {
		List<diadiem> diadiems = diadiemService.getAll(); 
		List<diadiem> diadiemSearch = new ArrayList<diadiem>();
		for (diadiem diadiem : diadiems) {
			if(diadiem.getDiachi().contains(kw)) diadiemSearch.add(diadiem);
		}
		model.addAttribute("listDiadiem", diadiemSearch);
		return "diadiem/list_addess";
	}

	@GetMapping("/new")
	public String save(Map<String, Object> model) {
		diadiem diadiem = new diadiem();
		model.put("diadiem", diadiem);
		return "diadiem/new_address";
	}

	@PostMapping(value = "/save")
	public String save(@ModelAttribute("diadiem") diadiem diadiem) {
		diadiemService.saveDiadiem(diadiem);
		return "redirect:/admin/diadiem";
	}
	
	@PostMapping(value = "/saveEdit")
	public String saveEdit(@RequestParam int id, @ModelAttribute("diadiem") diadiem diadiem) {
		diadiem.setId(id);
		diadiemService.saveDiadiem(diadiem);
		return "redirect:/admin/diadiem";
	}


	@RequestMapping("/edit")
	public String edit(@RequestParam int id, Model model) {
		diadiem diadiem = diadiemService.getById(id);
		model.addAttribute("diadiem", diadiem);
		return "diadiem/edit_address";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		diadiemService.deleteDiadiem(id);
		return "redirect:/admin/diadiem";
	}
}
