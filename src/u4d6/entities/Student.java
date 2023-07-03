package u4d6.entities;

import u4d6.exceptions.InvalidNameException;
import u4d6.exceptions.NumberLessThanZeroException;

public class Student {
	private String name;
	private String surname;
	private int age;

	public Student(String name, String surname, int age) throws InvalidNameException {
		super();
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
		if (name.length() < 2)
			throw new InvalidNameException(name + " è troppo corto. Lunghezza minima 3 caratteri");
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws InvalidNameException {
		if (surname.length() < 2)
			throw new InvalidNameException(surname + " è troppo corto. Lunghezza minima 3 caratteri");
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			throw new NumberLessThanZeroException(age);
		this.age = age;
	}

}
