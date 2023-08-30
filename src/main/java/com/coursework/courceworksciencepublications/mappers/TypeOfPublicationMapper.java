package com.coursework.courceworksciencepublications.mappers;

import com.coursework.courceworksciencepublications.model.dto.TypeOfPublicationDTO;
import com.coursework.courceworksciencepublications.model.entity.TypeOfPublication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeOfPublicationMapper {
    TypeOfPublicationDTO toScienceDTO(TypeOfPublication scientific);
}
