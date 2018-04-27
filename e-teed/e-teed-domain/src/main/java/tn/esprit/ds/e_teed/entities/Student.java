package tn.esprit.ds.e_teed.entities;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student extends User {

	private String level;

	public Student() {
		super();
	}

	public Student(String name, String login, String password, String email, String level) {
		super(name, login, password, email);
		this.level = level;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
