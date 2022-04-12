package com.company.paketciler;


import com.company.paketciler.model.Person;

public class Buildernew {
private long id ;
private String name;
private String surname;
private int age;

    public Buildernew() {
    }

    public Buildernew(long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Buildernew setName(String name){
        this.name=name;
        return this;
    }
    public Buildernew setSurname(String surname){
        this.surname=surname;
        return this;
    }
    public Buildernew setAge(int age){
        this.age=age;
        return this;
    }
    public Buildernew setId(Long id){
        this.id=id;
        return this;
    }

    public Person build(){
      Person p1=new Person(id,name,surname,age);
        System.out.println(p1);
        return p1 ;
    }


}
