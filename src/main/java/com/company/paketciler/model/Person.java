package com.company.paketciler.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "paketcidb")
public class Person  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 59,nullable = false)
    private String name;
    @Column(length = 59,nullable = false)
    private String surname;
    @Column(length = 59,nullable = false)
    private int age;

}
