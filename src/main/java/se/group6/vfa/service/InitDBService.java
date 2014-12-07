package se.group6.vfa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

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

@Transactional
@Service
public class InitDBService {

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

		Organisation google = new Organisation();
		google.setOrganisation_name("Google");
		organisationRepository.save(google);

		Organisation unicef = new Organisation();
		google.setOrganisation_name("Unicef");
		organisationRepository.save(unicef);

		VW vw1 = new VW();
		vw1.setOrganisation(google);
		vw1.setName("Code Club Volunteer");
		vw1.setDate_posted(new Date());
		vwRepository.save(vw1);

		VW vw2 = new VW();
		vw2.setOrganisation(google);
		vw2.setName("University Volunteer");
		vw2.setDate_posted(new Date());
		vwRepository.save(vw2);

		VW vw3 = new VW();
		vw3.setOrganisation(unicef);
		vw3.setName("Human Rights Volunteer");
		vw3.setDate_posted(new Date());
		vwRepository.save(vw3);

		VW vw4 = new VW();
		vw4.setOrganisation(unicef);
		vw4.setName("Events Usher Volunteer");
		vw4.setDate_posted(new Date());
		vwRepository.save(vw4);
	}
}
