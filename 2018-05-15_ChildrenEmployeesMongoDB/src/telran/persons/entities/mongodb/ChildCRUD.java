package telran.persons.entities.mongodb;

import telran.persons.dto.Child;
import telran.persons.dto.Person;

public class ChildCRUD extends PersonCRUD {
	public String kindergarten;

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}

	@Override
	public void setData(Person person) {
		super.setData(person);
		Child child = (Child) person;
		this.kindergarten = child.kindergarten;

	}

	@Override
	public Person getPerson() {
		Child res = new Child();
		fillPerson(res);
		res.kindergarten = kindergarten;
		return res;
	}

}
