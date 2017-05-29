package com.concretepage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.bean.Person;
import com.concretepage.service.PersonService;

@RestController
@RequestMapping("/info")
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping(value="/person/{id}", method = RequestMethod.GET )
	public Person getPersonById(@PathVariable("id") Integer id) {
		Person person = personService.getPersonById(id);
		return person;
	}	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value= "/person", method = RequestMethod.GET)
	public List<Person> getAllPersons() {
		List<Person> list = personService.getAllPersons();
		return list;
	}
} 