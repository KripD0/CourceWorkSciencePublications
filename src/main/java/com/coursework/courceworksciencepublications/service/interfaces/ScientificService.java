package com.coursework.courceworksciencepublications.service.interfaces;

import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.model.entity.PlaceOfPublication;
import com.coursework.courceworksciencepublications.model.entity.ThemeOfPublication;
import com.coursework.courceworksciencepublications.model.entity.TypeOfPublication;

import java.util.List;
public interface ScientificService {
    List<ScientificDTO> findAll();

    void delete(long id);

    void save(ScientificDTO scientificDTO);

    ThemeOfPublication createThemeOfPublication(String themeName);

    TypeOfPublication createTypeOfPublication(String type);

    PlaceOfPublication createPlaceOfPublication(String place);
}
