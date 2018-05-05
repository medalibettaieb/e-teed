package tn.esprit.ds.e_teed.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Local
public interface CourseServiceLocal extends IGenericDAO<Course> {
	void subscribeToCourse(Course course, User user);

	List<User> findStudentsByCourse(Course course);

	List<Course> findCoursesByStudent(User student);
}
