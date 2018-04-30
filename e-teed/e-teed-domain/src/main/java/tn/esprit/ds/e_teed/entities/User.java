package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6477185705912197510L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USR_CODE")
	private int code;
	@Column(name = "USR_NAME")
	private String name;
	@Column(name = "USR_LOGIN")
	private String login;
	@Column(name = "USR_PWD")
	private String password;
	@Column(name = "USR_EMAIL")
	private String email;

	@OneToMany(mappedBy = "user")
	private List<MarkDetail> markDetails;

	@ManyToMany(mappedBy = "studentsSubscribedIn")
	private List<Course> coursesSubscribedIn;

	@ManyToMany(mappedBy = "teachers")
	private List<Course> coursesTaught;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(String name, String login, String password, String email) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public List<MarkDetail> getMarkDetails() {
		return markDetails;
	}

	public void setMarkDetails(List<MarkDetail> markDetails) {
		this.markDetails = markDetails;
	}

	public List<Course> getCoursesSubscribedIn() {
		return coursesSubscribedIn;
	}

	public void setCoursesSubscribedIn(List<Course> coursesSubscribedIn) {
		this.coursesSubscribedIn = coursesSubscribedIn;
	}

	public List<Course> getCoursesTaught() {
		return coursesTaught;
	}

	public void setCoursesTaught(List<Course> coursesTaught) {
		this.coursesTaught = coursesTaught;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((coursesSubscribedIn == null) ? 0 : coursesSubscribedIn.hashCode());
		result = prime * result + ((coursesTaught == null) ? 0 : coursesTaught.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((markDetails == null) ? 0 : markDetails.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (code != other.code)
			return false;
		if (coursesSubscribedIn == null) {
			if (other.coursesSubscribedIn != null)
				return false;
		} else if (!coursesSubscribedIn.equals(other.coursesSubscribedIn))
			return false;
		if (coursesTaught == null) {
			if (other.coursesTaught != null)
				return false;
		} else if (!coursesTaught.equals(other.coursesTaught))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (markDetails == null) {
			if (other.markDetails != null)
				return false;
		} else if (!markDetails.equals(other.markDetails))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
