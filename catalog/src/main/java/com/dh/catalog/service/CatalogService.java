package com.dh.catalog.service;

import com.dh.catalog.dto.CatalogDTO;

public interface CatalogService {

    void save(CatalogDTO dto);

    String findByGenre(String genre);
}
