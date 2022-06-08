package com.dh.catalog.repository;

import com.dh.catalog.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Integer> {
    String findByGenre(String genre);
}
