package tn.esprit.ds.e_teed.mBeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceLocal;

@ManagedBean
@ViewScoped
public class CourseBean {
	private List<Course> courses;
	private List<Course> coursesByStudent;
	private Course courseSelected;
	@EJB
	private CourseServiceLocal courseServiceLocal;
	@ManagedProperty(value = "#{identityBean}")
	private IdentityBean identityBean;

	public String doSubscribeToCourse() {
		courseServiceLocal.subscribeToCourse(courseSelected, identityBean.getUser());
		return "/pages/studentHome?faces-redirect=true";
	}

	public List<Course> getCourses() {
		courses = courseServiceLocal.findAll();
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course getCourseSelected() {
		return courseSelected;
	}

	public void setCourseSelected(Course courseSelected) {
		this.courseSelected = courseSelected;
	}

	public IdentityBean getIdentityBean() {
		return identityBean;
	}

	public void setIdentityBean(IdentityBean identityBean) {
		this.identityBean = identityBean;
	}

	public List<Course> getCoursesByStudent() {
		coursesByStudent = courseServiceLocal.findCoursesByStudent(identityBean.getUser());
		return coursesByStudent;
	}

	public void setCoursesByStudent(List<Course> coursesByStudent) {
		this.coursesByStudent = coursesByStudent;
	}

}
