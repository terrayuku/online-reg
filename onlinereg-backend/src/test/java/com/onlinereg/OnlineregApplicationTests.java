package com.onlinereg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.onlinereg.models.Person;
import com.onlinereg.models.Persons;
import com.onlinereg.repository.PersonsRepository;

import org.springframework.boot.test.context.SpringBootTest;
import com.onlinereg.services.PersonsService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class OnlineregApplicationTests {

	@InjectMocks
	private PersonsService service;

	@Mock
  	private PersonsRepository repository;

	@Test
	public void getAllPersons() {
		when(repository.findAll())
		.thenReturn(mockPerson());
		
		when(service.getAllPersons())
			.thenReturn(mockUsers());
	}

	private List<Person> mockUsers() {

		List<Person> persons = new ArrayList<>();
		Person person1 = new Person("Test", "User", "078394847");
		Person person2 = new Person("User", "Test", "078394847");
		
		persons.add(person1);
		persons.add(person2);
		
		return persons;
	}

	private List<Persons> mockPerson() {

		List<Persons> persons = new ArrayList<>();
		Persons person1 = new Persons("Test", "User", "078394847");
		Persons person2 = new Persons("User", "Test", "078394847");
		
		persons.add(person1);
		persons.add(person2);
		
		return persons;
	}

}
