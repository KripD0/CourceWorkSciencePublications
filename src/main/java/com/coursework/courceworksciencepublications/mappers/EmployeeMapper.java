package com.coursework.courceworksciencepublications.mappers;

import com.coursework.courceworksciencepublications.model.dto.EmployeeDTO;
import com.coursework.courceworksciencepublications.model.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTO toEmployeeDTO(Employee employee);
}