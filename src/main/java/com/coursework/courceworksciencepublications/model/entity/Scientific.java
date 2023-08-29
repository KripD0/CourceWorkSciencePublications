package com.coursework.courceworksciencepublications.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Scientific {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private LocalDate dateOfPublish;

    private String keywords;

    @ManyToOne
    @JoinColumn(name = "place_of_publication_id")
    private PlaceOfPublication placeOfPublication;

    @ManyToOne
    @JoinColumn(name = "theme_of_publication_id")
    private ThemeOfPublication themeOfPublication;

    @ManyToOne
    @JoinColumn(name = "type_of_publication_id")
    private TypeOfPublication typeOfPublication;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}