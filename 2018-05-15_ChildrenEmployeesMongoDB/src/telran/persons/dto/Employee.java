package telran.persons.dto;

import java.time.LocalDate;

public class Employee extends Person {
	public String company;
	public int salary;

	public Employee() {
	}

	public Employee(int id, Address address, String name, LocalDate birthdate, String company, int salary) {
		super(id, address, name, birthdate);
		this.company = company;
		this.salary = salary;
	}

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
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", id=" + id + ", address=" + address + ", name="
				+ name + ", birthdate=" + birthdate + "]";
	}

}
