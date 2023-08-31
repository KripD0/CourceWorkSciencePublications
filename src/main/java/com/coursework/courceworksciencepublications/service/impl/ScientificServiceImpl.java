package com.coursework.courceworksciencepublications.service.impl;

import com.coursework.courceworksciencepublications.mappers.ScienceMapper;
import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.model.entity.PlaceOfPublication;
import com.coursework.courceworksciencepublications.model.entity.Scientific;
import com.coursework.courceworksciencepublications.model.entity.ThemeOfPublication;
import com.coursework.courceworksciencepublications.model.entity.TypeOfPublication;
import com.coursework.courceworksciencepublications.repository.PlaceOfPublicationRepository;
import com.coursework.courceworksciencepublications.repository.ScientificRepository;
import com.coursework.courceworksciencepublications.repository.ThemeOfPublicationRepository;
import com.coursework.courceworksciencepublications.repository.TypeOfPublicationRepository;
import com.coursework.courceworksciencepublications.service.interfaces.ScientificService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ScientificServiceImpl implements ScientificService {
    private final ScientificRepository scientificRepository;
    private final ThemeOfPublicationRepository themeOfPublicationRepository;
    private final TypeOfPublicationRepository typeOfPublicationRepository;
    private final PlaceOfPublicationRepository placeOfPublicationRepository;

    private final ScienceMapper scienceMapper;

    @Override
    public List<ScientificDTO> findAll() {
            List<Scientific> allScientific = scientificRepository.findAll();
        return allScientific.stream()
                .map(scienceMapper::toScienceDTO)
                .toList();
    }

    @Override
    @Transactional
    public void save(ScientificDTO scientificDTO) {
        scientificRepository.save(scienceMapper.toScientific(scientificDTO));
    }

    @Override
    @Transactional
    public ThemeOfPublication createThemeOfPublication(String themeName) {
        var theme = new ThemeOfPublication();
        theme.setName(themeName);
        return themeOfPublicationRepository.save(theme);
    }

    @Override
    @Transactional
    public TypeOfPublication createTypeOfPublication(String typeName) {
        var typeOfPublication = new TypeOfPublication();
        typeOfPublication.setName(typeName);
        return typeOfPublicationRepository.save(typeOfPublication);
    }

    @Override
    @Transactional
    public PlaceOfPublication createPlaceOfPublication(String place) {
        PlaceOfPublication placeOfPublication = new PlaceOfPublication();
        placeOfPublication.setTypeOfPlace(place);
        return placeOfPublicationRepository.save(placeOfPublication);
    }

    @Transactional
    @Override
    public void delete(long id) {
        scientificRepository.deleteById(id);
    }
}
