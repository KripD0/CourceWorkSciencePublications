package com.coursework.courceworksciencepublications.controllers;

import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.service.interfaces.ScientificService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/science")
@RequiredArgsConstructor
public class ScienceController {

    private final ScientificService scientificService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ScientificDTO> getAllScience() {
        return scientificService.findAll();
    }
}
