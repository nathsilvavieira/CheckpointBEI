package com.dh.catalog.controller;

import com.dh.catalog.dto.CatalogDTO;
import com.dh.catalog.service.CatalogService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/catalog", method=RequestMethod.GET)
public class CatallogController {

    @Autowired
    private CatalogService catalogService;

    @PostMapping()
    public ResponseEntity<Void> save(CatalogDTO dto){
        catalogService.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public String findByNome(@Param String nome){
        return catalogService.findByGenre(nome);
    }
}
