package com.company.paketciler.service;

import com.company.paketciler.model.Person;

import java.util.List;

public interface PersonService {
    void deletePerson(Long id);
    List<Person> getAllPerson();
}
