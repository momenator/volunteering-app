package se.group6.vfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.group6.vfa.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
