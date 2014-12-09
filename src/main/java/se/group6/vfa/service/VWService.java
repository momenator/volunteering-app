package se.group6.vfa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.group6.vfa.entity.VW;
import se.group6.vfa.repository.UserRepository;
import se.group6.vfa.repository.VWRepository;

@Service
@Transactional
public class VWService {

	@Autowired
	private VWRepository vwRepository;

	@Autowired
	private UserRepository userRepository;

	public List<VW> findAll() {
		return vwRepository.findAll();
	}

	public VW findOne(int id) {
		return vwRepository.findOne(id);
	}

	public void save(VW vw) {
		vwRepository.save(vw);
	}

}
