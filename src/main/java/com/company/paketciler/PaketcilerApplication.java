package com.company.paketciler;

import com.company.paketciler.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaketcilerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaketcilerApplication.class, args);
        Person person;
        Builder builder = new Builder();
                System.out.println(
                        Person.builder()
                .name("Ali")
                .surname("Ashraf")
                .age(21)
                .id(1L)
                .build());

        Person person1= new Buildernew()
                .setId(2L).
                setName("Ali").
                setSurname("Ashraf").
                setAge(21).
                build();


    }

}
