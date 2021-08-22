package com.onlinereg.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.onlinereg.models.Person;
import com.onlinereg.services.PersonsService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/persons")
public class PersonsController {
    @Resource(name = "personsService")
    private PersonsService personsService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personsService.getAllPersons();
    }

    @PostMapping("/save")
    public Person saveCustomer(final @RequestBody Person person) {
        System.out.println(person.toString());
        return personsService.save(person);
    }
}
