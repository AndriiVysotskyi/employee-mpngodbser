package telran.persons.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import telran.persons.entities.mongodb.PersonCRUD;

@Repository
public interface PersonsRepository extends MongoRepository<PersonCRUD, Integer> {

}
