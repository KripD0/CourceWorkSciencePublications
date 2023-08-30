package com.coursework.courceworksciencepublications.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class PlaceOfPublicationDTO {
    private long id;
    private String typeOfPlace;
    private List<ScientificDTO> scientifics;
}
