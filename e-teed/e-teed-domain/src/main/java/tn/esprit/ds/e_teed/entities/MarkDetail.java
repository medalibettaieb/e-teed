package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: MarkDetail
 *
 */
@Entity
@Table(name = "T_MarkDetail")
public class MarkDetail implements Serializable {
	@EmbeddedId
	private MarkDetailId markDetailId;
	private Float mark;

	@ManyToOne
	private User teacher;

	@ManyToOne
	@JoinColumn(name = "code", referencedColumnName = "USR_CODE", updatable = false, insertable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "idCourse", referencedColumnName = "id", updatable = false, insertable = false)
	private Course course;
	private static final long serialVersionUID = 1L;

	public MarkDetail() {
		super();
	}

	public MarkDetail(Float mark, User student, User teacher, Course course) {
		super();
		this.mark = mark;
		this.user = student;
		this.teacher = teacher;
		this.course = course;
		this.markDetailId = new MarkDetailId(user.getCode(), course.getId());
	}

	public MarkDetail(Float mark, User user, Course course) {
		super();
		this.mark = mark;
		this.user = user;
		this.course = course;
		this.markDetailId = new MarkDetailId(user.getCode(), course.getId());
	}

	public Float getMark() {
		return this.mark;
	}

	public void setMark(Float mark) {
		this.mark = mark;
	}

	public MarkDetailId getMarkDetailId() {
		return markDetailId;
	}

	public void setMarkDetailId(MarkDetailId markDetailId) {
		this.markDetailId = markDetailId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

}
