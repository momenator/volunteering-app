package se.group6.vfa.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.group6.vfa.entity.Organisation;
import se.group6.vfa.entity.Role;
import se.group6.vfa.entity.User;
import se.group6.vfa.entity.VW;
import se.group6.vfa.repository.OrganisationRepository;
import se.group6.vfa.repository.RoleRepository;
import se.group6.vfa.repository.UserRepository;
import se.group6.vfa.repository.VWRepository;

@Service
public class InitDbService {
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VWRepository vwRepository;

	@Autowired
	private OrganisationRepository organisationRepository;

	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);

		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);

		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);

		Organisation google = new Organisation();
		google.setOrganisation_name("Google");

		VW codeClubVolunteer = new VW();
		codeClubVolunteer.setOrganisation(google);

	}
}
