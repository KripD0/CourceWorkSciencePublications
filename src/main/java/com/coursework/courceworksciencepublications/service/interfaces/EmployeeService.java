package com.coursework.courceworksciencepublications.service.interfaces;

import com.coursework.courceworksciencepublications.model.dto.EmployeeDTO;
import com.coursework.courceworksciencepublications.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> findAll();

    void save(Employee employee);
}
