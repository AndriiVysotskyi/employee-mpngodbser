package telran.persons.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telran.persons.dto.Person;
import telran.persons.entities.mongodb.PersonCRUD;

@Service
public class PersonsMongoDB implements IPersons {
	private static final String PACKAGE_CRUD = "telran.persons.entities.mongodb.";
	@Autowired
	PersonsRepository persons;

	@Override
	public boolean addPerson(Person person) {
		PersonCRUD personCRUD = getPersonCrud(person);

		if (persons.existsById(person.getId()))
			return false;

		persons.save(personCRUD);
		return true;
	}

	private PersonCRUD getPersonCrud(Person person) {
		String className = person.getClass().getSimpleName();
		String crudName = PACKAGE_CRUD + className + "CRUD";
		try {
			PersonCRUD personCRUD = (PersonCRUD) Class.forName(crudName).newInstance();
			personCRUD.setData(person);
			return personCRUD;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			return null;
		}

	}

	@Override
	public void addPersons(Iterable<Person> persons) {
		List<PersonCRUD> personsCRUD = new ArrayList<>();
		persons.forEach(x -> personsCRUD.add(getPersonCrud(x)));
		this.persons.saveAll(personsCRUD);

	}

	@Override
	public List<Person> getPersonsByDates(LocalDate dateFronm, LocalDate dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		List<PersonCRUD> personsCRUD = persons.findAll();
		return personsCRUD.parallelStream().map(PersonCRUD::getPerson).collect(Collectors.toList());

	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersonByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getEmployeesByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getChildrenByKindergarten(String kindergarten) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getEmployeesBySalary(int salaryFrom, int salaryTo) {
		// TODO Auto-generated method stub
		return null;
	}

}
