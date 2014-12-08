package se.group6.vfa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VW_Application {
	@Id
	@GeneratedValue
	private Integer Id;

	private String name;

	private User user;

	private List<VW> vw_applied;
}
