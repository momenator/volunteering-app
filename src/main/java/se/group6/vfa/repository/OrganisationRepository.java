package se.group6.vfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.group6.vfa.entity.Organisation;

public interface OrganisationRepository extends
		JpaRepository<Organisation, Integer> {

}
