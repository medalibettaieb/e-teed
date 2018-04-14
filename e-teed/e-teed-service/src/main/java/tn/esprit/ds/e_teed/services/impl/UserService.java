package tn.esprit.ds.e_teed.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceLocal;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceRemote;
import tn.esprit.ds.e_teed.utilities.GenericDAO;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService extends GenericDAO<User> implements UserServiceRemote, UserServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserService() {
		super(User.class);
	}

	@Override
	public User login(String login, String password) {
		User user = null;
		try {
			user = entityManager.createQuery("SELECT u FROM User u WHERE u.login=:l AND u.password=:p", User.class)
					.setParameter("l", login).setParameter("p", password).getSingleResult();
		} catch (Exception e) {
		}
		return user;
	}
}
