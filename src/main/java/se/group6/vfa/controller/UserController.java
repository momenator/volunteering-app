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

import se.group6.vfa.entity.User;
import se.group6.vfa.entity.VW;
import se.group6.vfa.service.UserService;
import se.group6.vfa.service.VWService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private VWService vwService;

	@ModelAttribute("user")
	public User constructUser() {
		return new User();
	}

	@ModelAttribute("vw")
	public VW constructVW() {
		return new VW();
	}

	@RequestMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users";
	}

	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id) {
		model.addAttribute("user", userService.findOne(id));
		return "user-detail";
	}

	@RequestMapping("/register")
	public String register() {
		return "user-register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		userService.save(user);
		return "redirect:/register.html?success=true";
	}

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String addVWtoUser(@ModelAttribute("vw") VW vw, Principal principal) {
		vw.setDate_posted(new Date());
		String name = principal.getName();
		User user = userService.findOneByNameReturnUser(name);
		List<VW> vw_applied = user.getVw_applied();
		vwService.save(vw);
		vw_applied.add(vw);
		user.setVw_applied(vw_applied);
		userService.save(user);
		return "redirect:/profile.html";
	}

	@RequestMapping("/profile")
	public String account(Model model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("user", userService.findOneByName(name));
		return "user-detail";
	}
}
