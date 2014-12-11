package se.group6.vfa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import se.group6.vfa.entity.Organisation;
import se.group6.vfa.repository.OrganisationRepository;
import se.group6.vfa.repository.RoleRepository;

@Service
@Transactional
public class OrganisationService {

	@Autowired
	private OrganisationRepository organisationRepository;

	@Autowired
	private RoleRepository roleRepository;

	public List<Organisation> findAll() {
		return organisationRepository.findAll();
	}

	public Organisation findOne(int id) {
		return organisationRepository.findOne(id);
	}

	public void save(Organisation organisation) {
		organisation.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		organisation.setPassword(encoder.encode(organisation.getPassword()));
		organisation.setRole(roleRepository.findByName("ROLE_ORGANISATION"));
		organisationRepository.save(organisation);

	}

	public Object findOneByName(String name) {
		Organisation organisation = organisationRepository
				.findByOrganisationName(name);
		return findOne(organisation.getOrganisationId());
	}

	public Organisation findOneByNameReturnOrganisation(String name) {
		return organisationRepository.findByOrganisationName(name);
	}

}
