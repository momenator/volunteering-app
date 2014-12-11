package se.group6.vfa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

		Role roleOrganisation = new Role();
		roleOrganisation.setName("ROLE_ORGANISATION");
		roleRepository.save(roleOrganisation);

		User userAdmin = new User();
		userAdmin.setEnabled(true);
		userAdmin.setName("admin");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		userAdmin.setPassword(encoder.encode("admin"));

		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);

		User user2 = new User();
		user2.setName("Muhammad Rafdi");

		List<Role> roles2 = new ArrayList<Role>();
		roles2.add(roleUser);
		user2.setRoles(roles2);

		Organisation google = new Organisation();
		google.setOrganisationName("Google");
		google.setAddress("Belgrave House, 76 Buckingham Palace Road, London SW1W 9TQ, United Kingdom");
		google.setDescription("Google's mission is to organize the world's information.");
		google.setEmail("mail@google.com");
		organisationRepository.save(google);

		Organisation unicef = new Organisation();
		unicef.setOrganisationName("Unicef");
		unicef.setDescription("Unicef is the world's leading organisation for children");
		unicef.setAddress("1 Grange Wold, Riby, Grimsby, Lincolnshire DN37 8NS, UK");
		unicef.setEmail("mail@unicef.com");
		organisationRepository.save(unicef);

		VW vw1 = new VW();
		vw1.setOrganiser_name("Google");
		vw1.setName("Code Club Volunteer");
		vw1.setJob_description("Volunteering is generally considered an altruistic activity and is intended to promote goodness or improve human quality of life.");
		vw1.setDate_posted(new Date());
		vwRepository.save(vw1);

		VW vw2 = new VW();
		vw2.setOrganiser_name("Google");
		vw2.setName("University Volunteer");
		vw2.setJob_description("Volunteering is generally considered an altruistic activity and is intended to promote goodness or improve human quality of life. ");
		vw2.setDate_posted(new Date());
		vwRepository.save(vw2);

		VW vw3 = new VW();
		vw3.setOrganiser_name("UNICEF");
		vw3.setName("Human Rights Volunteer");
		vw3.setJob_description("Volunteering is generally considered an altruistic activity and is intended to promote goodness or improve human quality of life. ");
		vw3.setDate_posted(new Date());
		vwRepository.save(vw3);

		VW vw4 = new VW();
		vw4.setOrganiser_name("WHO");
		vw4.setName("Events Usher Volunteer");
		vw4.setJob_description("Volunteering is generally considered an altruistic activity and is intended to promote goodness or improve human quality of life.");
		vw4.setDate_posted(new Date());
		vwRepository.save(vw4);

		List<VW> vw_applied = new ArrayList<VW>();
		vw_applied.add(vw1);
		vw_applied.add(vw2);
		vw_applied.add(vw3);

		user2.setVw_applied(vw_applied);
		user2.setDescription("A Passionate Computer Science Student at UCL");
		user2.setSex("Male");
		user2.setEmail("mail@test.uk");
		user2.setAge(24);
		userRepository.save(user2);

	}
}
