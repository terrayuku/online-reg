package com.onlinereg.services;

import java.util.ArrayList;
import java.util.List;

import com.onlinereg.models.Person;
import com.onlinereg.models.Persons;
import com.onlinereg.repository.PersonsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personsService")
public class PersonsService {
    
    @Autowired
    PersonsRepository repository;

    public Person save(Person person) {
        Persons persons = storePersonData(person);
        return mapPerson(repository.save(persons));
    }

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();
        for(Persons p: repository.findAll()) {
            persons.add(mapPerson(p));
        }
        return persons;
    }

    private Persons storePersonData(final Person person) {
        Persons personsInfo = new Persons();
        personsInfo.setFullname(person.getFullname());
        personsInfo.setSurname(person.getSurname());
        personsInfo.setTelephone(person.getTelephone());
        return personsInfo;
    }

    private Person mapPerson(final Persons person) {
        Person personsInfo = new Person();
        personsInfo.setFullname(person.getFullname());
        personsInfo.setSurname(person.getSurname());
        personsInfo.setTelephone(person.getTelephone());
        return personsInfo;
    }
}

