package telran.persons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.persons.api.PersonsApiConstants;
import telran.persons.dto.Child;
import telran.persons.dto.Employee;
import telran.persons.dto.Person;
import telran.persons.model.IPersons;

@ComponentScan(basePackages = "telran.persons.model")
@EnableMongoRepositories("telran.persons.model")
@RestController
public class ChildrenEmployeesRestController {
	@Autowired
	IPersons persons;

	@PostMapping(value = PersonsApiConstants.ADD_CHILD)
	boolean addChild(@RequestBody Child person) {
		return persons.addPerson(person);
	}

	@PostMapping(value = PersonsApiConstants.ADD_EMPLOYEE)
	boolean addPerson(@RequestBody Employee person) {
		return persons.addPerson(person);
	}
}
