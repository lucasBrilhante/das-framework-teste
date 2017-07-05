package app;
import java.sql.SQLException;

import framework.*;
public class Student extends User{
	private String course;
	
	public Student(String name, String registration, String course) {
		setName(name);
		setRegistration(registration);
		this.course = course;
	}	
	
	@Override
	public void create(String name, String registration) {
		Database.insertUser(name, registration);
	}

	@Override
	public void delete(int idUser) {
		Database.deleteUser(idUser);
	}

	@Override
	public boolean update(int idUser, String name, String registration) {
		Database.updateUser(idUser, name, registration);
		return true;
	}

	@Override
	public void visualize() {
		try {
			Database.viewTableUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
