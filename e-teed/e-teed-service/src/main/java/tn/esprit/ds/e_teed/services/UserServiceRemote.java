package tn.esprit.ds.e_teed.services;

import javax.ejb.Remote;

import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
