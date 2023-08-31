package com.coursework.courceworksciencepublications.controllers;

import com.coursework.courceworksciencepublications.model.dto.ScientificDTO;
import com.coursework.courceworksciencepublications.model.entity.PlaceOfPublication;
import com.coursework.courceworksciencepublications.model.entity.ThemeOfPublication;
import com.coursework.courceworksciencepublications.model.entity.TypeOfPublication;
import com.coursework.courceworksciencepublications.service.interfaces.ScientificService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

///место
@RestController
@RequestMapping("/api/science")
@RequiredArgsConstructor
public class ScienceController {

    private final ScientificService scientificService;

    @Operation(summary = "Get all science",
            description = """
                    This controller method get all science, return HTTP code 200.
                    """)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ScientificDTO> getAllScience() {
        return scientificService.findAll();
    }

    @Operation(summary = "create theme of publication",
            description = """
                    This controller method create theme of publication, return HTTP code 201.
                    """)
    @PostMapping("/theme")
    @ResponseStatus(HttpStatus.CREATED)
    public ThemeOfPublication createTheme(String themeName) {
        return scientificService.createThemeOfPublication(themeName);
    }

    @Operation(summary = "create place of publication",
            description = """
                    This controller method create place of publication, return HTTP code 201.
                    """)
    @PostMapping("/place")
    @ResponseStatus(HttpStatus.CREATED)
    public PlaceOfPublication createPlace(String place) {
        return scientificService.createPlaceOfPublication(place);
    }

    @Operation(summary = "create type of publication",
            description = """
                    This controller method create type of publication, return HTTP code 201.
                    """)
    @PostMapping("/type")
    @ResponseStatus(HttpStatus.CREATED)
    public TypeOfPublication createType(String type) {
        return scientificService.createTypeOfPublication(type);
    }

    @Operation(summary = "delete science",
            description = """
                    This controller method delete science, return HTTP code 200.
                    """)
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") long id) {
        scientificService.delete(id);
    }


    @Operation(summary = "create science",
            description = """
                    This controller method create science, return HTTP code 200.
                    """)
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void createScientific(ScientificDTO scientificDTO) {
        scientificService.save(scientificDTO);
    }

    @PutMapping("/{id}")
    public void updateScience(@PathVariable("id") long id, ScientificDTO scientificDTO) {

    }
}