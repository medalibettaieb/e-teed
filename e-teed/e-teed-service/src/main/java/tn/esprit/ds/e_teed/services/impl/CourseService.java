package tn.esprit.ds.e_teed.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceLocal;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote;
import tn.esprit.ds.e_teed.utilities.GenericDAO;

/**
 * Session Bean implementation class CourseService
 */
@Stateless
public class CourseService extends GenericDAO<Course> implements CourseServiceRemote, CourseServiceLocal {
	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public CourseService() {
		super(Course.class);
	}

	@Override
	public void subscribeToCourse(Course course, User user) {
		if (course.getStudentsSubscribedIn() ==null) {
			List<User> users = new ArrayList<>();
			users.add(user);
			course.setStudentsSubscribedIn(users);
		}
		else {
			course.getStudentsSubscribedIn().add(user);
		}
		em.merge(course);

	}

}
