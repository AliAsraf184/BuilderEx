package com.company.paketciler.controller;

import com.company.paketciler.model.Person;
import com.company.paketciler.service.impl.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServiceImpl personService;


    @GetMapping("/get")
    List<Person> get(){
       return  personService.getAllPerson();
    }

    @GetMapping("/get/{index}")
    Person get1( @PathVariable int index){
        return personService.getAllPerson().get(index);
    }
    @GetMapping("/get1")
    void get(@RequestBody Person person){
        System.out.println(person);
    }

}
