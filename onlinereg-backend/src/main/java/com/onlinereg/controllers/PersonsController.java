package com.onlinereg.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.onlinereg.models.Person;
import com.onlinereg.models.Persons;
import com.onlinereg.services.PersonsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return personsService.save(person);
    }
}
