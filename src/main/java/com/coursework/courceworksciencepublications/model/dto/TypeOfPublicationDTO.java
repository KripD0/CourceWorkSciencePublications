package com.coursework.courceworksciencepublications.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class TypeOfPublicationDTO {
    private long id;
    private String name;
    private List<ScientificDTO> scientifics;
}
