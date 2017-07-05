package app;

import java.util.ArrayList;
import java.util.List;

import framework.*;

public class Application {

	public static void main(String[] args) {
		User ze = new Student("Zé", "131313", "Ciências Políticas");
		ze.create();
		
		User paulo = new Student("Paulo Markes", "12345", "Teatro");
		paulo.create();
		
		Resource room1 = new ClassRoom("Sala 1", "Sala dedicada a software", 5, 20);
		room1.save();
		
		Resource room2 = new ClassRoom("Sala 2", "Sala dedicada a teatro", 6, 30);
		room2.save();

		List <User> users = new ArrayList<>();
		users.add(ze);
		users.add(paulo);
		
		Allocator.allocate(room1, users);
		Allocator.visualize();
		
	}

}
