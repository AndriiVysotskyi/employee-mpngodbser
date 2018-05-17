package telran.persons.entities.mongodb;

import telran.persons.dto.Employee;
import telran.persons.dto.Person;

public class EmployeeCRUD extends PersonCRUD {
	String company;
	int salary;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void setData(Person person) {
		super.setData(person);
		Employee empl = (Employee) person;
		this.company = empl.getCompany();
		this.salary = empl.getSalary();
	}

	@Override
	public Person getPerson() {
		Employee res = new Employee();
		fillPerson(res);
		res.company = company;
		res.salary = salary;
		return res;
	}

}
