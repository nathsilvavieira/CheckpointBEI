package com.dh.catalog.service.impl;



import com.dh.catalog.dto.CatalogDTO;
import com.dh.catalog.model.Catalog;
import com.dh.catalog.repository.CatalogRepository;
import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogRepository repository;

    @Autowired
    private MovieFeign movies;

    @Override
    public void save(CatalogDTO dto) {
        Catalog catalog = new Catalog();
        catalog.setNome(dto.getNome());
        repository.save(catalog);
    }

    @Override
    public Long findByNome(String nome) {
        var catalog = repository.findByNome(nome);
        return catalog.getId();
    }

    @Override
    public String findMovieByNome(String nome) {
        var catalog = repository.findByNome(nome);
        return movies.findNome(catalog.getId());
    }
}
