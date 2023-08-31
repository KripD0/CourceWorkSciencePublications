package com.coursework.courceworksciencepublications.model.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private long id;
    private String surname;
    private String name;
    private String secondName;
    private String position;
    private String scientificTitle;
    private String scientificDegree;
}