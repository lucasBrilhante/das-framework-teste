package app;
import java.sql.SQLException;

import framework.*;

public class Application {

	public static void main(String[] args) {
		try {
			Student student = new Student();
			
			student.create("abcd", "12345", "engenharia de software");
			
			
			Database.addFieldToUser("abcd", "int");
			Student mat = new Student(nome, 1442, soft);
			mat.create());
			
			Database.insertResource("sala", "");
			
			Database.viewTableUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
