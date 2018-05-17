package telran.persons.dto;

import java.time.LocalDate;

public class Child extends Person {
	public String kindergarten;

	public Child(int id, Address address, String name, LocalDate birthdate, String kindergarten) {
		super(id, address, name, birthdate);
		this.kindergarten = kindergarten;
	}

	public Child() {
	}

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}

	@Override
	public String toString() {
		return "Child [kindergarten=" + kindergarten + ", id=" + id + ", address=" + address + ", name=" + name
				+ ", birthdate=" + birthdate + "]";
	};

}
