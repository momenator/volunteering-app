package se.group6.vfa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.group6.vfa.entity.VW;
import se.group6.vfa.service.VWService;

@Controller
public class VWController {

	@Autowired
	private VWService vwService;

	@ModelAttribute("vw")
	public VW constructVW() {
		return new VW();
	}

	@RequestMapping("/vws")
	public String vw_list(Model model) {
		model.addAttribute("vws", vwService.findAll());
		return "vws";
	}

	@RequestMapping("/vws/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("vw", vwService.findOne(id));
		return "vw-detail";
	}

	@RequestMapping(value = "/vws", method = RequestMethod.POST)
	public String adVW(@ModelAttribute("vw") VW vw) {
		vw.setDate_posted(new Date());
		vwService.save(vw);
		return "redirect:/vws.html";
	}

}
