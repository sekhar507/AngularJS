package com.concretepage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.concretepage.bean.Person;
@Service
public class PersonService {
	private List<Person> list = new ArrayList<>();
	{
		list.add(new Person(1, "Mahesh", "Varanasi"));
		list.add(new Person(2, "Ram", "Ayodhya"));
		list.add(new Person(3, "Krishna", "Mathura"));
		list.add(new Person(4, "Ravan", "Srilanka"));
	}
	public Person getPersonById(int pid) {
		Predicate<Person> personPredicate = p-> p.getPid() == pid;
		Person obj = list.stream().filter(personPredicate).findFirst().get();
		return obj;
	}	
	public List<Person> getAllPersons(){
		return list;
	}
}
