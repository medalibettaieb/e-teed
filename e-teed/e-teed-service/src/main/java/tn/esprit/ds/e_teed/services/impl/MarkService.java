package tn.esprit.ds.e_teed.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.MarkDetail;
import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceLocal;
import tn.esprit.ds.e_teed.services.interfaces.MarkServiceLocal;
import tn.esprit.ds.e_teed.services.interfaces.MarkServiceRemote;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceLocal;

/**
 * Session Bean implementation class MarkService
 */
@Stateless
public class MarkService implements MarkServiceRemote, MarkServiceLocal {

	@PersistenceContext
	private EntityManager em;
	@EJB
	private UserServiceLocal userServiceLocal;
	@EJB
	private CourseServiceLocal courseServiceLocal;

	/**
	 * Default constructor.
	 */
	public MarkService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assignMark(User student, User teacher, Course course, Float mark) {

		student = userServiceLocal.find(student.getCode());
		teacher = userServiceLocal.find(teacher.getCode());
		course = courseServiceLocal.find(course.getId());

		MarkDetail markDetail = new MarkDetail(mark, student, teacher, course);

		em.persist(markDetail);

	}

}
