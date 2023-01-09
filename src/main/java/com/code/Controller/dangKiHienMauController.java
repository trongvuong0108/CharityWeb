package com.code.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.Entity.phieudk;
import com.code.Entity.thongtin;
import com.code.Repository.postRepository;
import com.code.IService.phieudkService;
import com.code.IService.thongtinService;

@Controller
@RequestMapping("/dangki")
public class dangKiHienMauController {
	@Autowired
	private thongtinService thongtinService;
	
	@Autowired
	private postRepository postRepository;
	
	@Autowired
	private phieudkService phieudkService;
	
	@Autowired
	private MailSender mailSender;

	@GetMapping("/dienEmail")
	public String dangki(Map<String, Object> model, @RequestParam int id) {
		thongtin thongtin = new thongtin();
        model.put("thongtin",thongtin);
		return "voluntee/email";
	}
	
	@PostMapping("/saveEmail")
	public String dangki(@ModelAttribute("thongtin") thongtin thongtin , @RequestParam int id_post ) {	
		if(thongtinService.findAllByEmail(thongtin.getEmail()) == null) 
		{
			return "redirect:/dangki/dontHasInfo?id_post="+Integer.toString(id_post)+"&&username=" +thongtin.getEmail();
		}	
		else
		{		
			return "redirect:/dangki/hasInfo?id_post="+Integer.toString(id_post)+"&&username=" +thongtin.getEmail();
		}
	}
	@GetMapping("/hasInfo")
	public String hasInfo(Map<String, Object> model, @RequestParam int id_post,@RequestParam String username) {	
		List<phieudk> phieudks = phieudkService.getAll();
		for (phieudk phieudk : phieudks) {
			if(phieudk.getThongtin().getEmail().equals(username) && phieudk.getBaidang().getId() == id_post)
				return "voluntee/signed_up";
		}
		model.put("thongtin",thongtinService.findAllByEmail(username));
		return "voluntee/edit_voluntee"; 
	}
	
	@GetMapping("/dontHasInfo")
	public String dontHasInfo(Map<String, Object> model, @RequestParam int id_post,@RequestParam String username) {
		thongtin thongtin = new thongtin();
        model.put("thongtin",thongtin);
//        System.out.print(thongtin.toString());
        return "voluntee/signup_voluntee";
	}
	
	
	@PostMapping("/savedontHasInfo")
	public String saveInfo(@ModelAttribute("thongtin") thongtin thongtin , @RequestParam int id_post ) {
		sendMail(thongtin.getEmail(),"thank you","thank you");
		thongtinService.save(thongtin);
		phieudk phieudk = new phieudk();
		phieudk.setBaidang(postRepository.findById(id_post).get());
		phieudk.setThongtin(thongtin);
		phieudkService.save(phieudk);
		return "redirect:/";
	}
	
	@PostMapping("/savehasInfo")
	public String saveInfo(@ModelAttribute("thongtin") thongtin thongtin , @RequestParam int id_post ,@RequestParam int id_user) {
		sendMail(thongtin.getEmail(),"thank you","thank you");
		thongtin.setId(id_user);
		thongtinService.save(thongtin);
		phieudk phieudk = new phieudk();
		phieudk.setBaidang(postRepository.findById(id_post).get());
		phieudk.setThongtin(thongtin);
		phieudkService.save(phieudk);
		return "redirect:/";
	}
	
	public void sendMail(String to, String subject , String contenxt)
	{
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("ngaitrong0108@gmail.com");
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(contenxt);
		mailSender.send(mailMessage);
	}
}
