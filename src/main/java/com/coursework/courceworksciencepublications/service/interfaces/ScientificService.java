package com.coursework.courceworksciencepublications.service.interfaces;

import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;

import java.util.List;
public interface ScientificService {
    List<ScientificDTO> findAll();

    void delete(long id);
}
