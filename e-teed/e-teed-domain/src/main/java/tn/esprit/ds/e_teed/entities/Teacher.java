package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.ds.e_teed.entities.User;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity

public class Teacher extends User implements Serializable {

	
	private int experience;
	private static final long serialVersionUID = 1L;

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
