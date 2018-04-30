package tn.esprit.ds.e_teed.mBeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceLocal;

@ManagedBean
public class CourseBean {
	private List<Course> courses;
	@EJB
	private CourseServiceLocal courseServiceLocal;
	

	public List<Course> getCourses() {
		courses=courseServiceLocal.findAll();
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
