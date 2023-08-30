package com.coursework.courceworksciencepublications.mappers;


import com.coursework.courceworksciencepublications.model.dto.PlaceOfPublicationDTO;
import com.coursework.courceworksciencepublications.model.entity.PlaceOfPublication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlaceOfPublicationMapper {
    PlaceOfPublicationDTO toScienceDTO(PlaceOfPublication placeOfPublication);
}
