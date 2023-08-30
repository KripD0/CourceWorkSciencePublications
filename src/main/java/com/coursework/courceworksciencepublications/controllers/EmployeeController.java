package com.coursework.courceworksciencepublications.controllers;

import com.coursework.courceworksciencepublications.model.dto.EmployeeDTO;
import com.coursework.courceworksciencepublications.model.entity.Employee;
import com.coursework.courceworksciencepublications.service.interfaces.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Контроллер для работы с таблицей employee.",
        description = """
                Контроллер выполняет CRUD операции с сущностью employee.
                """)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Operation(summary = "Получение всех сотрудников",
            description = """
                    Этот метод контроллера ничего не принимает и возвращает всех сотрудников.
                    """)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDTO> getAllEmployers() {
        return employeeService.findAll();
    }

    @Operation(summary = "Создание сотрудника",
            description = """
                    Этот метод контроллера принимает сотрудника и возвращает код ответа 201.
                    """)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(Employee employee){
        employeeService.save(employee);
    }

    @Operation(summary = "Обновление сотрудника",
            description = """
                    Этот метод контроллера принимает сотрудника и возвращает код ответа 200.
                    """)
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@PathVariable("id") long id, Employee employee){
        employee.setId(id);
        employeeService.save(employee);
    }
}