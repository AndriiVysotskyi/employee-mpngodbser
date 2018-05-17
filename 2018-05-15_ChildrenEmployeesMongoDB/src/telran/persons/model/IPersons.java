package telran.persons.model;

import java.time.LocalDate;
import java.util.List;

import telran.persons.dto.Person;

public interface IPersons {
	boolean addPerson(Person person);

	void addPersons(Iterable<Person> persons);

	List<Person> getPersonsByDates(LocalDate dateFronm, LocalDate dateTo);

	List<Person> getAllPersons();

	Person getPerson(int id);

	List<Person> getPersonByCity(String city);

	List<Person> getEmployeesByCompany(String company);

	List<Person> getChildrenByKindergarten(String kindergarten);

	List<Person> getEmployeesBySalary(int salaryFrom, int salaryTo);
}
