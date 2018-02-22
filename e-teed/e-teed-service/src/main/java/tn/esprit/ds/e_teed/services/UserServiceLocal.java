package tn.esprit.ds.e_teed.services;

import javax.ejb.Local;

import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
