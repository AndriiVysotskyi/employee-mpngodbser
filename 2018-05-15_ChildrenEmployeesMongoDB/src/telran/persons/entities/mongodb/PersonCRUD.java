package telran.persons.entities.mongodb;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import telran.persons.dto.Address;
import telran.persons.dto.Person;

@Document(collection = "children_employees")
public abstract class PersonCRUD {
	@Id
	int id;
	Address address;
	String name;
	String birthdate;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setData(Person person) {
		this.id = person.getId();
		this.address = person.getAddress();
		this.name = person.getName();
		this.birthdate = person.getBirthdate().toString();
	}

	abstract public Person getPerson();

	protected void fillPerson(Person person) {
		person.id = id;
		person.address = address;
		person.birthdate = LocalDate.parse(birthdate);
		person.name = name;
	}

}
