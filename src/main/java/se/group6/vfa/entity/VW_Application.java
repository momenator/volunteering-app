package se.group6.vfa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class VW_Application {
	@Id
	@GeneratedValue
	private Integer Id;

	private String name;

	@OneToOne
	private User user;

	@OneToMany
	private List<VW> vw_applied;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<VW> getVw_applied() {
		return vw_applied;
	}

	public void setVw_applied(List<VW> vw_applied) {
		this.vw_applied = vw_applied;
	}

}
