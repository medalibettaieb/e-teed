package tn.esprit.ds.e_teed.entities;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity

public class Teacher extends User {

	private int experience;

	public Teacher() {
		super();
	}

	public Teacher(String name, String login, String password, String email, int experience) {
		super(name, login, password, email);
		this.experience = experience;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
