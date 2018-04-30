package tn.esprit.ds.e_teed.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Remote
public interface CourseServiceRemote extends IGenericDAO<Course> {
	void subscribeToCourse(Course course, User user);

	List<User> findStudentsByCourse(Course course);
}
