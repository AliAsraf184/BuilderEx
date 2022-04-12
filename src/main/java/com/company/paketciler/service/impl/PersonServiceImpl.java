package com.company.paketciler.service.impl;

import com.company.paketciler.model.Person;
import com.company.paketciler.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
   List<Person> people = new ArrayList<>();
    @Override
    public void deletePerson(Long id) {

    }

    @Override
    public List<Person> getAllPerson() {
       people.add( new Person(1l,"Ali","Ashraf",21));
        people.add( new Person(1l,"Cavad","Qurbanli",29));
        people.add( new Person(1l,"Filankes","Filankesov",31));


        return people;
    }
}
