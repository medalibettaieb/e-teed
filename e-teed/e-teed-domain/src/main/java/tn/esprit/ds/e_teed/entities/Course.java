package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity
@Table(name = "T_COURSE")
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6536611956795943434L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "T_STUDENT_COURSE", joinColumns = @JoinColumn(name = "studentid", referencedColumnName = "id"))
	private List<User> studentsSubscribedIn;
	@ManyToMany
	@JoinTable(name = "T_TEACHER_COURSE")
	private List<User> teachers;

	@OneToMany(mappedBy = "course")
	private List<MarkDetail> markDetails;

	public Course() {
		super();
	}

	public Course(String name) {
		super();
		this.name = name;
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
