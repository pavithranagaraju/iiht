package com.nttdata.springs.jpa;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import com.nttdata.springs.entity.Person;

@Repository
@Transactional
public class Personjpa {
	//connect to database
	@PersistenceContext
	EntityManager entityManager;
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id) 
	{
		return entityManager.find
				(Person.class, id);//JPA
	}
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
}
