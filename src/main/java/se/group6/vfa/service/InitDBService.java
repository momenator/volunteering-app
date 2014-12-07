package se.group6.vfa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.group6.vfa.repository.RoleRepository;

@Service
public class InitDBService {
	@Autowired
	private RoleRepository roleRepository;
}
