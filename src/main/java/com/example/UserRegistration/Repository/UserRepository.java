package com.example.UserRegistration.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.UserRegistration.Entity.SimpleUser;

public interface UserRepository extends CrudRepository<SimpleUser, Long> {

/*	save(entity)	: Saves or updates an entity.
 	
	saveAll(entities): Saves or updates multiple entities.
	
	findById(id)	:  Retrieves an entity by its ID.
	findAll(): Retrieves all entities.
	existsById(id): Checks whether an entity exists by ID.
	count(): 	Returns the total number of entities.
	deleteById(id):	Deletes an entity by its ID.
	delete(entity):	Deletes a specific entity.
	deleteAll(): 	Deletes all entities.
	deleteAll(entities): 	Deletes a collection of specified entities.
	
*/
}
