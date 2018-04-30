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
		List<User> users = findStudentsByCourse(course);
		if (users != null) {
			if (!users.contains(user)) {
				users.add(user);
				course.setStudentsSubscribedIn(users);
				em.merge(course);
			} else {
				System.out.println("already subscrbed in ");
			}

		} else {
			users = new ArrayList<>();
			users.add(user);
			course.setStudentsSubscribedIn(users);
			em.merge(course);

		}

	}

	@Override
	public List<User> findStudentsByCourse(Course course) {
		return em.createQuery("select u from User u where :p member of u.coursesSubscribedIn", User.class)
				.setParameter("p", course).getResultList();
	}

}
