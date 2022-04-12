package com.company.paketciler;

import com.company.paketciler.model.Person;

public class Builder {

  String name;
  String surname;
  int age;
  long id;

    public Builder() {
    }

    public Builder(String name, String surname, int age, long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    Person person= new Person();
    public String name(String name){
           person.setName(name);
           return person.getName();
    }
    public Long id(Long id){
        person.setId(id);
        return person.getId();
    }
    public String surname(String surname){
        person.setSurname(surname);
        return person.getSurname();
    }
    public int age(int age){
        person.setAge(age);
        return person.getAge();
    }
    public Person builder(String name, String surname, int age, Long id) {
    return null;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
