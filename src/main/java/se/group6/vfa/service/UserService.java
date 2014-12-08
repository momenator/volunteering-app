package se.group6.vfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.group6.vfa.entity.User;
import se.group6.vfa.entity.VW;
import se.group6.vfa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VWRepository vwRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public User findOneWithVW(int id) {
		User user = findOne(id);
		List<VW> vw_applied = user.getVW_applied();
		for (VW vw : vw_applied) {
			List<VW> vw_items = vw
		}
		user.setVW_applied(vw_applied);
		return user;
	}
}
