package se.group6.vfa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se.group6.vfa.entity.User;
import se.group6.vfa.entity.VW;
import se.group6.vfa.entity.VW_Application;

public interface VW_ApplicationRepository extends
		JpaRepository<VW_Application, Integer> {
	List<VW> findByUser(User user);
}
