package com.coursework.courceworksciencepublications.service.interfaces;

import com.coursework.courceworksciencepublications.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(long id);

    void save(Employee employee);
}
