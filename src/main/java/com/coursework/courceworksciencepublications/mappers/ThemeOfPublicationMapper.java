package com.coursework.courceworksciencepublications.mappers;

import com.coursework.courceworksciencepublications.model.dto.ThemeOfPublicationDTO;
import com.coursework.courceworksciencepublications.model.entity.ThemeOfPublication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ThemeOfPublicationMapper {
    ThemeOfPublicationDTO toScienceDTO(ThemeOfPublication themeOfPublication);
}
