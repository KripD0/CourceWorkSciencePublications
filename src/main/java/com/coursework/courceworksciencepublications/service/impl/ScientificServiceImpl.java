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
@RequiredArgsConstructor
public class ScientificServiceImpl implements ScientificService {
    private final ScientificRepository scientificRepository;
    private final ScienceMapper scienceMapper;

    @Transactional
    @Override
    public List<ScientificDTO> findAll() {
            List<Scientific> allScientific = scientificRepository.findAll();
        return allScientific.stream()
                .map(scienceMapper::toScienceDTO)
                .toList();
    }

    @Transactional
    @Override
    public void delete(long id) {
        scientificRepository.deleteById(id);
    }
}
