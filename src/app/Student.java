package app;

import framework.*;

public class Student extends User{
	private String course;
	
	public Student(String name, String registration, String course) {
		setName(name);
		setRegistration(registration);
		setCourse(course);
	}	
	
	public void setCourse(String course){
		this.course = course;
	}
	
	@Override
	public void create() {
		System.out.println("Usuário cadastrado com sucesso");
	}

	@Override
	public void delete() {
		System.out.println("Usuário deletado com sucesso");
	}

	@Override
	public boolean update() {
		System.out.println("Usuário atualizado com sucesso");
		return true;
	}

	@Override
	public void visualize() {
		System.out.println("Name: " + getName() + " Registration: " + 
				   getRegistration() + " Course: " + course);
	}

}
