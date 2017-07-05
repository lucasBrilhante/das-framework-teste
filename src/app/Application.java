package app;
import java.sql.SQLException;

import framework.*;

public class Application {

	public static void main(String[] args) {
		try {
			Database.insertUser("Paulo Markes", "123456");
			Database.insertUser("Ze", "78910");
			
			Database.viewTableUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
