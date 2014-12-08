package se.group6.vfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.group6.vfa.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String string);

}
