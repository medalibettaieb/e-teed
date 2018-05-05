package tn.esprit.ds.e_teed.mBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.ds.e_teed.entities.Student;
import tn.esprit.ds.e_teed.entities.Teacher;
import tn.esprit.ds.e_teed.entities.User;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceLocal;

@ManagedBean
@SessionScoped
public class IdentityBean {
	private User user = new User();

	@EJB
	private UserServiceLocal userServiceLocal;

	public String doLogin() {
		String navigateTo = "";
		User userLoggedIn = userServiceLocal.login(user.getLogin(), user.getPassword());
		if (userLoggedIn != null) {
			user = userLoggedIn;
			if (userLoggedIn instanceof Teacher) {
				navigateTo = "/pages/teacherHome?faces-redirect=true";
			} else if (userLoggedIn instanceof Student) {
				navigateTo = "/pages/studentHome?faces-redirect=true";
			}
		} else {
			System.out.println("ouups ....");
		}
		return navigateTo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
