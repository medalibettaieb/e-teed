package tn.esprit.ds.e_teed.app.client.gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote;
import tn.esprit.ds.e_teed.services.interfaces.MarkServiceRemote;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceRemote;

public class TestMarkDetail {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServiceRemote userServiceRemote = (UserServiceRemote) context.lookup(
				"e-teed-ear/e-teed-service/UserService!tn.esprit.ds.e_teed.services.interfaces.UserServiceRemote");
		CourseServiceRemote courseServiceRemote = (CourseServiceRemote) context.lookup(
				"e-teed-ear/e-teed-service/CourseService!tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote");
		MarkServiceRemote markServiceRemote = (MarkServiceRemote) context.lookup(
				"e-teed-ear/e-teed-service/MarkService!tn.esprit.ds.e_teed.services.interfaces.MarkServiceRemote");

		markServiceRemote.assignMark(userServiceRemote.find(2), userServiceRemote.find(6), courseServiceRemote.find(1),
				5F);

	}

}
