package se.group6.vfa.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class VW {
	@Id
	@GeneratedValue
	private Integer Id;

	private String name;

	private Date date_posted;

	private String job_description;

	private String organiser_name;

	@ManyToMany(mappedBy = "vw_applied")
	private List<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name = "organisation_id")
	private Organisation organisation;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getDate_posted() {
		return date_posted;
	}

	public void setDate_posted(Date date_posted) {
		this.date_posted = date_posted;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getOrganiser_name() {
		return organiser_name;
	}

	public void setOrganiser_name(String organiser_name) {
		this.organiser_name = organiser_name;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
