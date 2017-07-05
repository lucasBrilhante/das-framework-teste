package app;

import framework.Resource;

public class ClassRoom extends Resource {
	int capacity;
	
	public ClassRoom(String name, String description, int number, int capacity) {
		setName(name);
		setDescription(description);
		setNumber(number);
		setCapacity(capacity);
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void save() {
		System.out.println("Recurso cadastrado com sucesso");
	}

	@Override
	public void delete() {
		System.out.println("Recurso deletado com sucesso");
	}

	@Override
	public boolean update() {
		System.out.println("Dados do recurso atualizados com sucesso");
		return true;
	}
	
	@Override
	public void visualize() {
		System.out.println("Name: " + getName() + " Description: " + 
						   getDescription() + " Number: " + getNumber() + 
						   " Capacity: " + capacity);
	}

}
