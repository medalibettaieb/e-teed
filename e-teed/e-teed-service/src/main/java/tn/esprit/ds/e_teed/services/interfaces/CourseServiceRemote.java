package tn.esprit.ds.e_teed.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Remote
public interface CourseServiceRemote  extends IGenericDAO<Course>{

}
