package se.group6.vfa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se.group6.vfa.entity.User;
import se.group6.vfa.entity.VW;

public interface VWRepository extends JpaRepository<VW, Integer> {

	List<VW> findByUsers(List<User> users);
}
