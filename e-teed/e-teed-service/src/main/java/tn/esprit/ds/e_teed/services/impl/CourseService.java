package tn.esprit.ds.e_teed.services.impl;

import javax.ejb.Stateless;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceLocal;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote;
import tn.esprit.ds.e_teed.utilities.GenericDAO;

/**
 * Session Bean implementation class CourseService
 */
@Stateless
public class CourseService extends  GenericDAO<Course> implements CourseServiceRemote, CourseServiceLocal {

	/**
	 * Default constructor.
	 */
	public CourseService() {
		super(Course.class);
	}

}
