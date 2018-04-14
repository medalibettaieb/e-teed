package tn.esprit.ds.e_teed.services.interfaces;

import javax.ejb.Local;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Local
public interface CourseServiceLocal extends IGenericDAO<Course> {

}
