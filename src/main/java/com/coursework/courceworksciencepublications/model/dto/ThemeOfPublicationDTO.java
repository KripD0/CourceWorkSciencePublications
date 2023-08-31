package com.coursework.courceworksciencepublications.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class ThemeOfPublicationDTO {
    private long id;
    private String name;
    private List<ScientificDTO> scientifics;
}