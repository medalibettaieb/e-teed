package tn.esprit.ds.e_teed.app.client.gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.ds.e_teed.entities.Course;
import tn.esprit.ds.e_teed.entities.Student;
import tn.esprit.ds.e_teed.entities.Teacher;
import tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote;
import tn.esprit.ds.e_teed.services.interfaces.UserServiceRemote;

public class TestAddStudents {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServiceRemote userServiceRemote = (UserServiceRemote) context.lookup(
				"e-teed-ear/e-teed-service/UserService!tn.esprit.ds.e_teed.services.interfaces.UserServiceRemote");
		CourseServiceRemote courseServiceRemote = (CourseServiceRemote) context.lookup(
				"e-teed-ear/e-teed-service/CourseService!tn.esprit.ds.e_teed.services.interfaces.CourseServiceRemote");

		Student student = new Student("wiem", "wi", "wi", "wiem@we.tn", "pro");
		Student student2 = new Student("sofien", "so", "so", "sofien@we.tn", "pro");
		Student student3 = new Student("nihel", "ni", "ni", "nihel@we.tn", "intermediate");
		Student student4 = new Student("tahar", "ta", "ta", "taher@we.tn", "expert");

		Teacher teacher = new Teacher("heni", "ha", "ha", "hany@we.tn", 10);

		Course course = new Course("Regression Parametrique");

		userServiceRemote.update(student);
		userServiceRemote.update(student2);
		userServiceRemote.update(student3);
		userServiceRemote.update(student4);
		userServiceRemote.update(teacher);

		courseServiceRemote.update(course);
	}

}
