package com.coursework.courceworksciencepublications.repository;

import com.coursework.courceworksciencepublications.model.entity.Employee;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @EntityGraph(attributePaths = {"scientifics", "institutions"})
    List<Employee> findAll();
}