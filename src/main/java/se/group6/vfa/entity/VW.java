package se.group6.vfa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VW {
	@Id
	@GeneratedValue
	private Integer Id;
	private Date date_posted;
	private String job_description;
	private String company;
	private Integer organisation_id;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getOrganisation_id() {
		return organisation_id;
	}

	public void setOrganisation_id(Integer organisation_id) {
		this.organisation_id = organisation_id;
	}

}
