package com.coursework.courceworksciencepublications.service.impl;

import com.coursework.courceworksciencepublications.exceptions.EmployeeNotFoundException;
import com.coursework.courceworksciencepublications.model.entity.Employee;
import com.coursework.courceworksciencepublications.repository.EmployeeRepository;
import com.coursework.courceworksciencepublications.service.interfaces.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " not found."));
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}