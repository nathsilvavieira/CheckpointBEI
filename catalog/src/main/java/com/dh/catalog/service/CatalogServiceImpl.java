package com.dh.catalog.service;

import com.dh.catalog.dto.CatalogDTO;
import com.dh.catalog.entity.Catalog;
import com.dh.catalog.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private CatalogRepository repository;


    @Override
    public void save(CatalogDTO dto) {
        Catalog catalog = new Catalog();
        catalog.setNome("Missao impossivel");
        catalog.setGenre("Acao");
        catalog.setUrlStream("https://youtube.com/missao-impossivel");
        repository.save(catalog);
    }

    @Override
    public String findByGenre(String genre) {
        String genreMovie = repository.findByGenre(genre);
        return genreMovie;
    }
}
