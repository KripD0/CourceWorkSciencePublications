package com.coursework.courceworksciencepublications.controllers;

import com.coursework.courceworksciencepublications.model.dto.EmployeeDTO;
import com.coursework.courceworksciencepublications.service.interfaces.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Controller for wor with table employee.",
        description = """
                Controller doing CRUD operations with entity employee.
                """)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Operation(summary = "Get All employees",
            description = """
                    This controller method get nothing return all employees.
                    """)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDTO> getAllEmployers() {
        return employeeService.findAll();
    }

    @Operation(summary = "Create employee",
            description = """
                    This controller method get employee, return HTTP code 201.
                    """)
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(EmployeeDTO employeeDTO) {
        employeeService.save(employeeDTO);
    }

    @Operation(summary = "Update employee",
            description = """
                    This controller method get employee, return HTTP code 200.
                    """)
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@PathVariable("id") long id, EmployeeDTO employeeDTO) {
        employeeDTO.setId(id);
        employeeService.save(employeeDTO);
    }

    @Operation(summary = "Delete employee",
            description = """
                    This controller method get id employee, return HTTP code 200.
                    """)
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable("id") long id) {
        employeeService.delete(id);
    }
}