package com.coursework.courceworksciencepublications.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String surname;

    private String name;

    private String secondName;

    private String position;

    private String scientificTitle;

    private String scientificDegree;

    @OneToMany(mappedBy = "employee")
    private List<Scientific> scientifics;

    @ManyToMany(mappedBy = "employees")
    private Set<Institution> institutions;
}