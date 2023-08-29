package com.coursework.courceworksciencepublications.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PlaceOfPublication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String typeOfPlace;

    @OneToMany(mappedBy = "placeOfPublication")
    private List<Scientific> scientifics;
}