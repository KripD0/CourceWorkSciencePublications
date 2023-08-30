package com.coursework.courceworksciencepublications.mappers;

import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.model.entity.Scientific;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScienceMapper {

    ScientificDTO toScienceDTO(Scientific scientific);
}
