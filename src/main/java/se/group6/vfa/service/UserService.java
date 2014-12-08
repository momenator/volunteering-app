package se.group6.vfa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.group6.vfa.entity.User;
import se.group6.vfa.repository.UserRepository;
import se.group6.vfa.repository.VWRepository;
import se.group6.vfa.repository.VW_ApplicationRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VW_ApplicationRepository vw_ApplicationRepository;

	@Autowired
	private VWRepository vwRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public void save(User user) {
		userRepository.save(user);

	}

}
