package com.coursework.courceworksciencepublications.service.impl;

import com.coursework.courceworksciencepublications.mappers.EmployeeMapper;
import com.coursework.courceworksciencepublications.model.dto.EmployeeDTO;
import com.coursework.courceworksciencepublications.model.entity.Employee;
import com.coursework.courceworksciencepublications.repository.EmployeeRepository;
import com.coursework.courceworksciencepublications.service.interfaces.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDTO> findAll() {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        for (Employee employee : employeeRepository.findAll()) {
            employeeDTOS.add(employeeMapper.toEmployeeDTO(employee));
        }
        return employeeDTOS;
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public void delete(long id){
        employeeRepository.deleteById(id);
    }
}