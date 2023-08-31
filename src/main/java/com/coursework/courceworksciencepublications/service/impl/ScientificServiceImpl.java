package com.coursework.courceworksciencepublications.service.impl;

import com.coursework.courceworksciencepublications.mappers.ScienceMapper;
import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.model.entity.Scientific;
import com.coursework.courceworksciencepublications.repository.ScientificRepository;
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
    private final ScienceMapper scienceMapper;

    @Override
    public List<ScientificDTO> findAll() {
            List<Scientific> allScientific = scientificRepository.findAll();
        return allScientific.stream()
                .map(scienceMapper::toScienceDTO)
                .toList();
    }

    @Override
    public void save(ScientificDTO scientificDTO) {
        scientificRepository.save(scienceMapper.toScientific(scientificDTO));
    }

    @Transactional
    @Override
    public void delete(long id) {
        scientificRepository.deleteById(id);
    }
}
