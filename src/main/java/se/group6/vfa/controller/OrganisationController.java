package se.group6.vfa.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.group6.vfa.entity.Organisation;
import se.group6.vfa.entity.VW;
import se.group6.vfa.service.OrganisationService;
import se.group6.vfa.service.VWService;

@Controller
public class OrganisationController {

	@Autowired
	private OrganisationService organisationService;

	@Autowired
	private VWService vwService;

	@ModelAttribute("vw")
	public VW constructVW() {
		return new VW();
	}

	@ModelAttribute("organisation")
	public Organisation constructOrganisation() {
		return new Organisation();
	}

	@RequestMapping("/register-organisation")
	public String register() {
		return "organisation-register";
	}

	@RequestMapping(value = "/register-organisation", method = RequestMethod.POST)
	public String registerUser(
			@ModelAttribute("organisation") Organisation organisation) {
		organisationService.save(organisation);
		return "redirect:/register-organisation.html?success=true";
	}

	@RequestMapping("/organisations")
	public String vw_list(Model model) {
		model.addAttribute("organisations", organisationService.findAll());
		return "organisations";
	}

	@RequestMapping("/organisations/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("organisation", organisationService.findOne(id));
		return "vw-detail";
	}

	@RequestMapping("/organisation_profile")
	public String account(Model model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("organisation",
				organisationService.findOneByName(name));
		return "organisation-detail";
	}

	@RequestMapping(value = "/organisation_profile", method = RequestMethod.POST)
	public String addVWtoUser(@ModelAttribute("vw") VW vw, Principal principal) {
		vw.setDate_posted(new Date());
		String name = principal.getName();
		Organisation organisation = organisationService
				.findOneByNameReturnOrganisation(name);
		List<VW> vw_available = organisation.getVW_available();
		vwService.save(vw);
		vw_available.add(vw);
		organisation.setVW_available(vw_available);
		organisationService.save(organisation);
		return "redirect:/organisation_profile.html";
	}

}
