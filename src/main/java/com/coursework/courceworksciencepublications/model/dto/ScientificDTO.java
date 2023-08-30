package com.coursework.courceworksciencepublications.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ScientificDTO {
    private long id;
    private String name;
    private LocalDate dateOfPublish;
    private String keywords;
    private PlaceOfPublicationDTO placeOfPublicationDTO;
    private ThemeOfPublicationDTO themeOfPublicationDTO;
    private TypeOfPublicationDTO typeOfPublicationDTO;
    private EmployeeDTO employee;
}