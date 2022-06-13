package com.dh.catalog.controller;


import com.dh.catalog.dto.CatalogDTO;
import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody() CatalogDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{nome}")
    public Long findByNome(@PathVariable String nome){
        return service.findByNome(nome);
    }

    @GetMapping("/movie/{nome}")
    public String findMovieByNome(@PathVariable String nome){
        return service.findMovieByNome(nome);
    }
}
