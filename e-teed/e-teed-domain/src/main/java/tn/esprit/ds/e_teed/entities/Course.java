package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<User> studentsSubscribedIn;
	@ManyToMany
	private List<User> teachers;

	@OneToMany(mappedBy = "course")
	private List<MarkDetail> markDetails;
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MarkDetail> getMarkDetails() {
		return markDetails;
	}

	public void setMarkDetails(List<MarkDetail> markDetails) {
		this.markDetails = markDetails;
	}

	public List<User> getStudentsSubscribedIn() {
		return studentsSubscribedIn;
	}

	public void setStudentsSubscribedIn(List<User> studentsSubscribedIn) {
		this.studentsSubscribedIn = studentsSubscribedIn;
	}

	public List<User> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<User> teachers) {
		this.teachers = teachers;
	}

}
