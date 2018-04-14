package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.ds.e_teed.entities.User;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student extends User implements Serializable {

	
	private String level;
	private static final long serialVersionUID = 1L;

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
