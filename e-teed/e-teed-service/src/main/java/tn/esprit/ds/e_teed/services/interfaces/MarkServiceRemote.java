package tn.esprit.ds.e_teed.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.User;

@Remote
public interface MarkServiceRemote {

	void assignMark(User student, User teacher, Course course, Float mark);
}
